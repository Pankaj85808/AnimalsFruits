package com.example.animalsfruits;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class holder extends BaseAdapter {
    int arr[];
    String str[];
    Context c;
    holder (Context c,int arr[],String str[]) {
        this.c=c;
        this.arr=arr;
        this.str=str;
    }
    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=li.inflate(R.layout.holder2,null);
        ImageView i=(ImageView)convertView.findViewById(R.id.img);
        TextView t=(TextView)convertView.findViewById(R.id.lis);
        i.setImageResource(arr[position]);
        t.setText(str[position]);
        return convertView;
    }
}
