package com.example.wallp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class Singleview extends AppCompatActivity {
    Button set;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview);
        set = findViewById(R.id.set);
        imageView = findViewById(R.id.singleview);
        Intent i = getIntent();

        // Selected image id
        final int position = i.getExtras().getInt("id1");

        final ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        set.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                    try {
                        wallpaperManager.setResource(imageAdapter.mThumbIds[position]);
                        Toast.makeText(Singleview.this, "Wallpaper Updated Successful", Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
    }
    }

