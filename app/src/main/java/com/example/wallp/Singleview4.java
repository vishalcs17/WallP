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

public class Singleview4 extends AppCompatActivity {
    Button set;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview4);
        set = findViewById(R.id.set4);
        imageView = findViewById(R.id.singleview4);
        Intent i = getIntent();

        final int position = i.getExtras().getInt("id4");
        final ImageAdapter4 imageAdapter4 = new ImageAdapter4(this);

        imageView.setImageResource(imageAdapter4.animated[position]);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(imageAdapter4.animated[position]);
                    Toast.makeText(Singleview4.this,"Wallpaper Updated Successful",Toast.LENGTH_SHORT).show();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
