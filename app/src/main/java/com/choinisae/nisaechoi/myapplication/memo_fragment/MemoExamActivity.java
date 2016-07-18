package com.choinisae.nisaechoi.myapplication.memo_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class MemoExamActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView mListView;
    private ArrayList<MemoItem> mData;
    private MemoBaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_exam);

        mData = new ArrayList<>();
        mAdapter = new MemoBaseAdapter(getApplicationContext(), mData);
        mListView = (ListView) findViewById(R.id.frag_list_view);
        mListView.setAdapter(mAdapter);

        findViewById(R.id.frag_fab_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, WriteMemoActivity2.class);
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 && resultCode == RESULT_OK && data != null) {

//            String title = data.getStringExtra("title");
//            String content = data.getStringExtra("content");
//            MemoItem item = new MemoItem(title, content);
//            mData.add(item);

            mData.add(new MemoItem(data.getStringExtra("title"), data.getStringExtra("content")));
            mAdapter.notifyDataSetChanged();
        }
    }
}
