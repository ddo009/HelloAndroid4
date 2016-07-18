package com.choinisae.nisaechoi.myapplication.memo_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 18..
 */
public class MemoBaseAdapter extends BaseAdapter {

    private List<MemoItem> mData;
    private LayoutInflater mLayoutInflater;

    public MemoBaseAdapter(Context context, List<MemoItem> mData) {
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
        MemoHolder holder;
        if (convertView == null) {
            holder = new MemoHolder();
            convertView = mLayoutInflater.inflate(R.layout.memo_frag_item, parent, false);
            holder.title = (TextView) convertView.findViewById(R.id.memo_list_title);
            holder.content = (TextView) convertView.findViewById(R.id.memo_list_content);
            convertView.setTag(holder);
        } else {
            holder = (MemoHolder) convertView.getTag();
        }
        MemoItem item = (MemoItem) getItem(position);
        holder.title.setText(item.getTitle());
        holder.content.setText(item.getContent());
        return convertView;
    }
}

class MemoHolder {
    TextView title;
    TextView content;
}
