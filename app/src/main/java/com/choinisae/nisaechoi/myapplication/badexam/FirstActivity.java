package com.choinisae.nisaechoi.myapplication.badexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mResultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.first_btn).setOnClickListener(this);
        mResultTxt = (TextView) findViewById(R.id.first_result_txt);

        Intent intent = getIntent();
        if (intent != null) {
            mResultTxt.setText(intent.getStringExtra("text"));
        }

        // ---------------------------------------------------------------------

//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        };
//        findViewById(R.id.first_btn).setOnClickListener(listener);
//
//        // ---------------------------------------------------------------------
//
//        findViewById(R.id.first_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
        // ---------------------------------------------------------------------

        findViewById(R.id.first_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    // ---------------------------------------------------------------------
}
