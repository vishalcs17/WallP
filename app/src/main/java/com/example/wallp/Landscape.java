package com.example.wallp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.media.RemoteController;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.util.List;

public class Landscape extends AppCompatActivity {
    ImageView i1,i2,i3,i4, imageView;
    Button set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscape);
        set = findViewById(R.id.set);
        i1=findViewById(R.id.p1);
        i2=findViewById(R.id.p2);
        i3=findViewById(R.id.p3);
        i4=findViewById(R.id.p4);

        i1.setImageResource(R.drawable.p1);
        i2.setImageResource(R.drawable.p2);
        i3.setImageResource(R.drawable.p3);
        i4.setImageResource(R.drawable.w2);

        i1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(R.drawable.p1);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(R.drawable.p2);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(R.drawable.p3);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(R.drawable.w2);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        });


    }
}
