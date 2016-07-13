package com.choinisae.nisaechoi.myapplication.badexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mEditText = (EditText) findViewById(R.id.second_edt_txt);
        findViewById(R.id.second_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("text", mEditText.getText().toString());
        startActivity(intent);
    }
}
