package com.choinisae.nisaechoi.myapplication.memo_practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 7..
 */
public class MemoBaseAdapter extends BaseAdapter {

    private List<Memo> mData;
    private LayoutInflater mLayoutInflater;

    public MemoBaseAdapter(Context context, List<Memo> mData) {
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
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mLayoutInflater.inflate(R.layout.memo_item, parent, false);
            TextView title = (TextView) convertView.findViewById(R.id.memo_title);
            TextView content = (TextView) convertView.findViewById(R.id.memo_content);
            holder.title = title;
            holder.content = content;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Memo memo = (Memo) getItem(position);

        holder.title.setText(memo.getTitle());
        holder.content.setText(memo.getContent());

        return convertView;
    }

}

class ViewHolder {
    TextView title;
    TextView content;
}
