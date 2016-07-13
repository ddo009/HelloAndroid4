package com.choinisae.nisaechoi.myapplication.exam7_11;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class ExamSecondActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private ArrayList<CallModel> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_second);

        Intent intent = getIntent();
        String id = intent.getStringExtra("admin");
        Toast.makeText(ExamSecondActivity.this, id + "님 환영합니다.", Toast.LENGTH_SHORT).show();

        mData = new ArrayList<>();
        mData.add(new CallModel("최동해", "tel:010-5398-1489"));

        for (int i = 0; i < 20; i++) {
            mData.add(new CallModel("안드로이드" + i, "tel:010-1234-1234"));
        }

        mListView = (ListView) findViewById(R.id.call_list_view);
        CallAdapter adapter = new CallAdapter(getApplicationContext(), mData);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent callIntent = new Intent();
        Uri phoneNumber = Uri.parse(mData.get(position).getNumber());
        callIntent.setAction(Intent.ACTION_DIAL);
        callIntent.setData(phoneNumber);
        startActivity(callIntent);
    }
}
