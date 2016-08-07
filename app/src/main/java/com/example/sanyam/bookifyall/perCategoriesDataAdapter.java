package com.example.sanyam.bookifyall;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by sanyam on 29/7/16.
 */
public class perCategoriesDataAdapter extends ArrayAdapter<perCategoriesData>{

    Context context;
    ArrayList<perCategoriesData> mData;

    public perCategoriesDataAdapter(Context context, ArrayList<perCategoriesData> objects) {
        super(context, 0, objects);
        mData = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if( v == null ){

        }

        return v;
        //return super.getView(position, convertView, parent);
    }
}
