package com.choinisae.nisaechoi.myapplication.girdview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 21..
 */
public class GridMyAdapter extends BaseAdapter {

    private List<GridItem> mData;
    private LayoutInflater mLayoutInflater;

    public GridMyAdapter(Context context, List<GridItem> mData) {
        this.mData = mData;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridHolder holder;
        if (convertView == null) {
            holder = new GridHolder();
            convertView = mLayoutInflater.inflate(R.layout.grid_item_layout, parent, false);
            holder.image = (ImageView) convertView.findViewById(R.id.grid_item_image);
            holder.text = (TextView) convertView.findViewById(R.id.grid_item_text);
            convertView.setTag(holder);
        } else {
            holder = (GridHolder) convertView.getTag();
        }
        GridItem item = (GridItem) getItem(position);
        holder.image.setImageResource(item.getGridItemRes());
        holder.text.setText(item.getGridItemName());
        return convertView;
    }

}

class GridHolder {
    ImageView image;
    TextView text;
}
