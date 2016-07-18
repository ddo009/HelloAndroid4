package com.choinisae.nisaechoi.myapplication.memo_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class WriteMemoActivity2 extends AppCompatActivity implements MemoInterfaceListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_memo2);

        MemoFragment memoFragment = (MemoFragment) getSupportFragmentManager().findFragmentById(R.id.memo_fragment);
        memoFragment.setmListener(this);

    }

    @Override
    public void receiveData(String title, String content) {
        Intent intent = new Intent();
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        Toast.makeText(WriteMemoActivity2.this, "title : " + title, Toast.LENGTH_SHORT).show();
        Toast.makeText(WriteMemoActivity2.this, "content : " + content, Toast.LENGTH_SHORT).show();
        setResult(RESULT_OK, intent);
        finish();
    }
}
