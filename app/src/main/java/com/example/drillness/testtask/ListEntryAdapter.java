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

public class ListEntryAdapter extends BaseAdapter {
    private ArrayList<ListEntry> listEntryArrayList;

    private Integer[] imgid = {R.drawable.cleaner,
            R.drawable.defeatist,
            R.drawable.flumber,
            R.drawable.humanist,
            R.drawable.invulnerable,
            R.drawable.irrepressible,
            R.drawable.sloth,
            R.drawable.sniper,
            R.drawable.stormtrooper,
            R.drawable.victim
    };
    private LayoutInflater l_Inflater;

    public ListEntryAdapter(Context context, ArrayList<ListEntry> results) {
        listEntryArrayList = results;
        l_Inflater = LayoutInflater.from(context);
    }
    public long getItemId(int position) {
        return position;
    }
    public Object getItem(int position) {
        return listEntryArrayList.get(position);
    }
    public int getCount() {
        return this.listEntryArrayList.size();
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = l_Inflater.inflate(R.layout.list_entry_view, null);
            holder = new ViewHolder();
            holder.txt_name = (TextView) convertView.findViewById(R.id.name);
            holder.image = (ImageView) convertView.findViewById(R.id.image);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(imgid[listEntryArrayList.get(position).getImgId() - 1]);
        holder.txt_name.setText(listEntryArrayList.get(position).getName());
        return convertView;
    }

    static class ViewHolder {
        TextView txt_name;
        ImageView image;
    }
}


