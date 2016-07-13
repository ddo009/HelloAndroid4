package com.choinisae.nisaechoi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<Model> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mListView = (ListView) findViewById(R.id.list_view);
        mData = new ArrayList<>();
        Model model = new Model("최동해", "010-5398-1489");
        Model model2 = new Model("김민철", "010-4539-9113");
        mData.add(model);
        mData.add(model2);

        for (int i = 0; i < 50; i++) {
            mData.add(new Model("이름" + i, "폰넘버" + i));
        }

        MyBaseAdapter baseAdapter = new MyBaseAdapter(getApplicationContext(), mData);

        mListView.setAdapter(baseAdapter);


    }
}
