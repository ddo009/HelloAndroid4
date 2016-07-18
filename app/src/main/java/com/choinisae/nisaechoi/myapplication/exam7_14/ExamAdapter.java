package com.choinisae.nisaechoi.myapplication.exam7_14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 14..
 */
public class ExamAdapter extends BaseAdapter {

    private List<Models> mData;
    private LayoutInflater mLayoutInflater;

    public ExamAdapter(Context context, List<Models> mData) {
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
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = mLayoutInflater.inflate(R.layout.exam_item_layout, parent, false);
            holder.textView = (TextView) convertView.findViewById(R.id.exam_list_item);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        Models models = (Models) getItem(position);
        holder.textView.setText("" + models.getName());
        return convertView;
    }

}

class Holder {
    TextView textView;
}
