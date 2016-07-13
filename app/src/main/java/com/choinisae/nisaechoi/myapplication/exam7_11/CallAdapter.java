package com.choinisae.nisaechoi.myapplication.exam7_11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 11..
 */
public class CallAdapter extends BaseAdapter {

    private List<CallModel> mData;
    private LayoutInflater mInflater;

    public CallAdapter(Context context, List<CallModel> data) {
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
            convertView = mInflater.inflate(R.layout.call_item_layout, parent, false);
            TextView nameText = (TextView) convertView.findViewById(R.id.call_item_name);
            TextView numberText = (TextView) convertView.findViewById(R.id.call_item_number);
            CheckBox callChk = (CheckBox) convertView.findViewById(R.id.call_chk_box);

            holder.name = nameText;
            holder.number = numberText;
            holder.checkBox = callChk;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        CallModel item = (CallModel) getItem(position);
        holder.name.setText(item.getName());
        holder.number.setText(item.getNumber());
        return convertView;
    }

}

class ViewHolder {
    TextView name;
    TextView number;
    CheckBox checkBox;
}
