package com.choinisae.nisaechoi.myapplication.listexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class ListPracticeActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView mListView;
    private ArrayList<Item> mData;
    private ItemBaseAdapter mBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_practice);

        mListView = (ListView) findViewById(R.id.item_list_view);

        mData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mData.add(new Item("빨간포션" + i, "500"));
        }
        mBaseAdapter = new ItemBaseAdapter(getApplicationContext(), mData);
        mListView.setAdapter(mBaseAdapter);

        findViewById(R.id.fab_btn).setOnClickListener(this);

        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mData.add(new Item("빨간포션", "500"));
        mBaseAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item item = (Item) parent.getItemAtPosition(position);
        String itemName = item.getName();
        String itemPay = item.getPay();
//        Toast.makeText(ListPracticeActivity.this, "itemName : " + ((Item) parent.getItemAtPosition(position)).getName(), Toast.LENGTH_SHORT).show();
        Toast.makeText(ListPracticeActivity.this, "itemName : " + itemName + ", " + itemPay, Toast.LENGTH_SHORT).show();
//        if (position != 0 && position % 2 == 0) {
//            view.setBackgroundColor(Color.RED);
//        } else {
//            view.setBackgroundColor(Color.BLUE);
//        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        mData.remove(position);
        mBaseAdapter.notifyDataSetChanged();
        return true;
    }
}
