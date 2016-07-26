package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class NumberChangeActivity extends AppCompatActivity implements View.OnClickListener {

    private GridView mNumberGrid;
    private TextView mNumberText;
    private ArrayList<PhoneNumbers> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_change);

        mData = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            mData.add(new PhoneNumbers("" + i));
        }
        mData.add(new PhoneNumbers("*"));
        mData.add(new PhoneNumbers("0"));
        mData.add(new PhoneNumbers("#"));

        mNumberText = (TextView) findViewById(R.id.number_txt);
        mNumberGrid = (GridView) findViewById(R.id.number_grid);
        findViewById(R.id.number_call_btn).setOnClickListener(this);

        MyGridNumberAdapter adapter = new MyGridNumberAdapter(getApplicationContext(), mData);
        mNumberGrid.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {

    }
}
