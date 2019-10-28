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

public class Singleview extends AppCompatActivity {
    Button set;
    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview);
        set = findViewById(R.id.set);
        imageView = findViewById(R.id.singleview);
        imageView2 = findViewById(R.id.singleview2);
        Intent i = getIntent();

        // Selected image id
        final int position = i.getExtras().getInt("id");
        final ImageAdapter imageAdapter = new ImageAdapter(this);
        final ImageAdapter2 imageAdapter2 = new ImageAdapter2(this);

        imageView.setImageResource(imageAdapter.mThumbIds[position]);
        imageView2.setImageResource(imageAdapter2.quotes[position]);
            set.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                    try{
                        wallpaperManager.setResource(imageAdapter.mThumbIds[position]);
                        Toast.makeText(Singleview.this,"Wallpaper Updated Successful",Toast.LENGTH_SHORT).show();
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
    }
}

