package com.example.laptop.customcuntrylist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter
{
    int[] flags;
    String[] countryNames;
    Context Context;
    private LayoutInflater Inflter;

    CustomAdapter(Context context,String[] countryNames,int[] flags){

        this.Context = context;
        this.countryNames = countryNames;
        this.flags = flags;



    }



    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            view = Inflter.inflate(R.layout.sample_view, null);
            TextView country =view.findViewById(R.id.listViewId);
            ImageView icon = view.findViewById(R.id.imageViewId);
            country.setText(countryNames[i]);
            return view;
    }
}
