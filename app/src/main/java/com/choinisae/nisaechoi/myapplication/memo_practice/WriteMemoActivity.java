package com.choinisae.nisaechoi.myapplication.memo_practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class WriteMemoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTitleEdt;
    private EditText mContentEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_memo);

        mTitleEdt = (EditText) findViewById(R.id.memo_title_edt);
        mContentEdt = (EditText) findViewById(R.id.memo_content_edt);
        findViewById(R.id.memo_complete_btn).setOnClickListener(this);

        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("title");
            String content = intent.getStringExtra("content");
            mTitleEdt.setText(title);
            mContentEdt.setText(content);
        }

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        String title = mTitleEdt.getText().toString();
        String content = mContentEdt.getText().toString();
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        setResult(RESULT_OK, intent);
        finish();
    }
}
