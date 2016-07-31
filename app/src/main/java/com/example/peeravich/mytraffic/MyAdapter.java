package com.example.peeravich.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by peeravich on 31/7/2559.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit นี่คือการประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private  String[] titleString, detaiStrings;

    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] titleString,
                     String[] detaiStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleString = titleString;
        this.detaiStrings = detaiStrings;
    }

    @Override
    public int getCount() {
        return iconInts.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_lisview,viewGroup,false);//พาหนะของการนำพา คือนำรูปจาก...มาโชว์

        // For icon
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        imageView.setImageResource(iconInts[i]);

        //for text
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleString[i]);

        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detaiStrings[i]);

        return view1;
    }
} //Main class
