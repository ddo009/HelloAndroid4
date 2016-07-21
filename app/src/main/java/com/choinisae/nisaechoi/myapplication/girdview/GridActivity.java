package com.choinisae.nisaechoi.myapplication.girdview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<GridItem> mData;
    private GridMyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        mData = new ArrayList<>();
        mAdapter = new GridMyAdapter(getApplicationContext(), mData);

        gridView.setAdapter(mAdapter);
        findViewById(R.id.grid_item_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mData.add(new GridItem(R.mipmap.ic_launcher, "아이템이 추가되었습니다."));
        mAdapter.notifyDataSetChanged();
    }
}
