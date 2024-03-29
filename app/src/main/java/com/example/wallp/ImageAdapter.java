package com.example.wallp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

//Image Adapter for LANDSCAPE activity....

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    ImageAdapter(Context c1){
        mContext = c1;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView1;

        if(view == null){
            imageView1 = new ImageView(mContext);
            imageView1.setLayoutParams(new GridView.LayoutParams(1200, 1200));
        }
        else
        {
            imageView1 = (ImageView) view;
        }
        imageView1.setImageResource(mThumbIds[i]);
        return imageView1;
    }
    Integer[] mThumbIds = {
            R.drawable.land1, R.drawable.land2,
            R.drawable.land3, R.drawable.land4,
            R.drawable.land5, R.drawable.land6};
}

//Image Adapter for QUOTES activity....

class  ImageAdapter2 extends BaseAdapter{
    private Context mContext2;
    ImageAdapter2(Context c2)
    {
        mContext2 = c2;
    }

    @Override
    public int getCount() {
        return quotes.length;
    }

    @Override
    public Object getItem(int position2) {
        return position2;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext2);
            imageView.setLayoutParams(new GridView.LayoutParams(1200, 1200));
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(quotes[i]);
        return imageView;
    }
    Integer[] quotes = {
            R.drawable.q1, R.drawable.q2,
            R.drawable.q3, R.drawable.q4,
            R.drawable.q1, R.drawable.q2};
}

//Image Adapter for ANIMALS activity....

class  ImageAdapter3 extends BaseAdapter{
    private Context mContext3;
    ImageAdapter3(Context c3)
    {
        mContext3 = c3;
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position3) {
        return position3;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext3);
            imageView.setLayoutParams(new GridView.LayoutParams(1200, 1200));
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(animals[i]);
        return imageView;
    }
    Integer[] animals = {
            R.drawable.a1, R.drawable.a2,
            R.drawable.a3, R.drawable.a1,
            R.drawable.a2, R.drawable.a3};
}

//Image Adapter for ANIMATED activity....

class  ImageAdapter4 extends BaseAdapter{
    private Context mContext4;
    ImageAdapter4(Context c4)
    {
        mContext4 = c4;
    }

    @Override
    public int getCount() {
        return animated.length;
    }

    @Override
    public Object getItem(int position4) {
        return position4;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext4);
            imageView.setLayoutParams(new GridView.LayoutParams(1200, 1200));
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(animated[i]);
        return imageView;
    }
    Integer[] animated = {
            R.drawable.c1, R.drawable.c2,
            R.drawable.c3, R.drawable.c4,
            R.drawable.c5, R.drawable.c6 };
}



