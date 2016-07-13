package com.choinisae.nisaechoi.myapplication.IntentExam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mResultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        findViewById(R.id.next_activity).setOnClickListener(this);
        mResultTxt = (TextView) findViewById(R.id.result_txt);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, NextActivity.class);
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1000 && resultCode == RESULT_OK && data != null) {
            String text = data.getStringExtra("text");
            mResultTxt.setText(text);
        }
    }
}
