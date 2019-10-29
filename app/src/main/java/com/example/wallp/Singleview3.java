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

public class Singleview3 extends AppCompatActivity {
    Button set;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview3);
        set = findViewById(R.id.set3);
        imageView = findViewById(R.id.singleview3);
        Intent i = getIntent();

        final int position = i.getExtras().getInt("id3");
        final ImageAdapter3 imageAdapter3 = new ImageAdapter3(this);

        imageView.setImageResource(imageAdapter3.animals[position]);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
                try {
                    wallpaperManager.setResource(imageAdapter3.animals[position]);
                    Toast.makeText(Singleview3.this,"Wallpaper Updated Successful",Toast.LENGTH_SHORT).show();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
