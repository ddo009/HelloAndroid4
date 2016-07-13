package com.choinisae.nisaechoi.myapplication.IntentExam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class NextActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        findViewById(R.id.end_btn).setOnClickListener(this);
        mEditText = (EditText) findViewById(R.id.edt_txt);

    }

    @Override
    public void onClick(View v) {
        String text = mEditText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("text", text);
        setResult(RESULT_OK, intent);
        finish();
    }
}
