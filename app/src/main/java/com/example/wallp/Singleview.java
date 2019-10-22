package com.example.wallp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Singleview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleview);
    }

    Intent intent = getIntent();

    int position = intent.getExtras().getInt("id");
    ImageAdapter imageAdapter = new ImageAdapter(this);

    ImageView imageView = (ImageView) findViewById(R.id.singleview);



}
