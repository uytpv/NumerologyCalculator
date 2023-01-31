package com.example.numerologycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] ids;
    String[] names;
    String[] dobs;

    public ItemAdapter(Context c, String[] i, String[] n, String[] d) {
        ids = i;
        names = n;
        dobs = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return ids.length;
    }

    @Override
    public Object getItem(int position) {
        return ids[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView dobTextView = (TextView) v.findViewById(R.id.dobTextView);

        String name = names[position];
        String dob = dobs[position];

        nameTextView.setText(name);
        dobTextView.setText(dob);
        return v;
    }
}
