package com.example.customadaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Customadapter  extends BaseAdapter {

    int[] flags;
    String[] countrynames;
    String[] details;
    Context context;

    private LayoutInflater inflater;

    public Customadapter( Context context, String[] countrynames, String[] details, int[] flags) {
        this.context = context;
        this.flags = flags;
        this.countrynames = countrynames;
        this.details = details;

    }

    @Override
    public int getCount() {
        return countrynames.length;
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

        if(convertView == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  inflater.inflate(R.layout.listview,parent,false);

            ImageView imageView =  convertView.findViewById(R.id.imageview);
            TextView textView = convertView.findViewById(R.id.texttitle);
            TextView textView1 = convertView.findViewById(R.id.textdetails);

            imageView.setImageResource(flags[position]);
            textView.setText(countrynames[position]);
            textView1.setText(details[position]);

        }

        return convertView;
    }
}
