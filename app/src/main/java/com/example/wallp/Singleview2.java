package com.example.wallp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class Singleview2 extends AppCompatActivity {
    Button set;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview2);

        set = findViewById(R.id.set2);
        imageView = findViewById(R.id.singleview2);

        Intent i = getIntent();
        // Selected image id
        final int position = i.getExtras().getInt("id2");
        final ImageAdapter2 imageAdapter2 = new ImageAdapter2(this);
        imageView.setImageResource(imageAdapter2.quotes[position]);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(imageAdapter2.quotes[position]);
                    Toast.makeText(Singleview2.this,"Wallpaper Updated Successful",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
