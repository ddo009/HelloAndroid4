package com.choinisae.nisaechoi.myapplication.android_db;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

public class AndroidDbActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTitle;
    private EditText mContent;
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_db);

        mTitle = (EditText) findViewById(R.id.database_title);
        mContent = (EditText) findViewById(R.id.database_content);

        findViewById(R.id.database_combtn).setOnClickListener(this);

        mResult = (TextView) findViewById(R.id.database_result);

    }

    @Override
    public void onClick(View v) {

    }
}
