package com.example.drillness.testtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by drillness on 05.12.17.
 */

public class ImageEntryAdapter extends BaseAdapter {
    private ArrayList<ImageEntry> imageList;

    private LayoutInflater inflater;

    public ImageEntryAdapter(Context context, ArrayList<ImageEntry> imageList) {
        this.imageList = imageList;
        inflater = LayoutInflater.from(context);
    }
    public long getItemId(int position) {
        return position;
    }
    public Object getItem(int position) {
        return imageList.get(position);
    }
    public int getCount() {
        return this.imageList.size();
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.image_entry_view, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(imageList.get(position).getImageId());
        holder.name.setText(imageList.get(position).getName());
        return convertView;
    }

    static class ViewHolder {
        TextView name;
        ImageView image;
    }
}


