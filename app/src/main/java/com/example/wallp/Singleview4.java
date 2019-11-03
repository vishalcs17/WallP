package com.example.wallp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Singleview4 extends AppCompatActivity {
    Button set,share;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview4);
        set = findViewById(R.id.set4);
        share = findViewById(R.id.share4);
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

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap b = BitmapFactory.decodeResource(getResources(),imageAdapter4.animated[position]);
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("image/jpeg");
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                b.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
                String path = MediaStore.Images.Media.insertImage(getContentResolver(),
                        b, "Title", null);
                Uri imageUri =  Uri.parse(path);
                share.putExtra(Intent.EXTRA_STREAM, imageUri);
                startActivity(Intent.createChooser(share, "Select"));
            }
        });
    }
}
