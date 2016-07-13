package com.choinisae.nisaechoi.myapplication.exam7_4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

/**
 * Created by donghaechoi on 2016. 7. 4..
 */
public class ModelBaseAdapter extends BaseAdapter {

    private ArrayList<ModelClass> mData;
    private LayoutInflater mInflater;

    public ModelBaseAdapter(Context context, ArrayList<ModelClass> data) {
        mData = data;
        mInflater = LayoutInflater.from(context);
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
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.exam_list_item, parent, false);
            ImageView itemImage = (ImageView) convertView.findViewById(R.id.examitem_image_view);
            TextView titleTxt = (TextView) convertView.findViewById(R.id.title_text_view);
            TextView contentTxt = (TextView) convertView.findViewById(R.id.content_text_view);
            holder.imageView = itemImage;
            holder.title = titleTxt;
            holder.content = contentTxt;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ModelClass model = (ModelClass) getItem(position);
        holder.imageView.setImageResource(model.getImageRes());
        holder.title.setText(model.getTitleTxt());
        holder.content.setText(model.getContentTxt());
        if (position % 2 == 0) {
            holder.content.setBackgroundColor(Color.BLUE);
        } else {
            holder.content.setBackgroundColor(Color.RED);
        }
        return convertView;
    }
}

class ViewHolder {
    ImageView imageView;
    TextView title;
    TextView content;
}
