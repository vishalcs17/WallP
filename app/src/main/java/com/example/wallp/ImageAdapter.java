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

    public ImageAdapter(Context c){
        mContext = c;
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
        ImageView imageView;

        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(mThumbIds[i]);
        return imageView;
    }

    public Integer[] mThumbIds = {
            R.drawable.p1, R.drawable.p2,
            R.drawable.p3, R.drawable.w2,
            R.drawable.p1, R.drawable.p3};
}

//Image Adapter for QUOTES activity....

class  ImageAdapter2 extends BaseAdapter{
    private Context mContext2;
    public ImageAdapter2(Context c)
    {
        mContext2 = c;
    }

    @Override
    public int getCount() {
        return quotes.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
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
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        }
        else
        {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(quotes[i]);
        return imageView;
    }
    public Integer[] quotes = {
            R.drawable.q1, R.drawable.q2,
            R.drawable.q3, R.drawable.q4,
            R.drawable.q1, R.drawable.q2};
}

