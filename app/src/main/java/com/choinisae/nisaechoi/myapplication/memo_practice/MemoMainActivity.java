package com.choinisae.nisaechoi.myapplication.memo_practice;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class MemoMainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ListView mListView;
    private ArrayList<Memo> mData;
    private MemoBaseAdapter mAdapter;
    private int mItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_main);

        mData = new ArrayList<>();
        findViewById(R.id.memo_fab_btn).setOnClickListener(this);
        mListView = (ListView) findViewById(R.id.memo_list_view);
        mAdapter = new MemoBaseAdapter(getApplicationContext(), mData);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, WriteMemoActivity.class);
        startActivityForResult(intent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1000 && resultCode == RESULT_OK && data != null) {
            String title = data.getStringExtra("title");
            String content = data.getStringExtra("content");
            mData.add(new Memo(title, content));
            mAdapter.notifyDataSetChanged();
        } else if (requestCode == 2000 && resultCode == RESULT_OK && data != null) {
            String title = data.getStringExtra("title");
            String content = data.getStringExtra("content");
            mData.remove(mItemPosition);
            mData.add(mItemPosition, new Memo(title, content));
            mAdapter.notifyDataSetChanged();
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String title = mData.get(position).getTitle();
        String content = mData.get(position).getContent();
        Intent intent = new Intent(this, WriteMemoActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        mItemPosition = position;
        startActivityForResult(intent, 2000);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setMessage("삭제하시겠습니까?.")
                .setTitle("경고!")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mData.remove(position);
                        mAdapter.notifyDataSetChanged();
                        Toast.makeText(MemoMainActivity.this, "삭제되었습니다.", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MemoMainActivity.this, "취소", Toast.LENGTH_SHORT).show();
            }
        }).show();
        return true;
    }
}
