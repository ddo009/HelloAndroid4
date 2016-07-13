package com.choinisae.nisaechoi.myapplication.listexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

/**
 * Created by donghaechoi on 2016. 7. 4..
 */
public class ItemBaseAdapter extends BaseAdapter {

    private ArrayList<Item> mData;
    private LayoutInflater mLayoutInflater;

    public ItemBaseAdapter(Context context, ArrayList<Item> data) {
        mData = data;
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
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();

            convertView = mLayoutInflater.inflate(R.layout.list_item_view, parent, false);

            TextView itemNameTxt = (TextView) convertView.findViewById(R.id.item_name);
            TextView itemPayTxt = (TextView) convertView.findViewById(R.id.item_pay);

            holder.itemName = itemNameTxt;
            holder.itemPay = itemPayTxt;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Item item = (Item) getItem(position);

        holder.itemName.setText(item.getName());
        holder.itemPay.setText(item.getPay());

        return convertView;
    }

}

class ViewHolder {
    TextView itemName;
    TextView itemPay;
}
