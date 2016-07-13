package com.choinisae.nisaechoi.myapplication.exam7_4;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class ListExamActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<ModelClass> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exam);

        mData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mData.add(new ModelClass(R.mipmap.ic_launcher, "안드로이드" + i, "안드로이드" + i));
        }

        ListView listView = (ListView) findViewById(R.id.exam_list_view);
        ModelBaseAdapter adapter = new ModelBaseAdapter(getApplicationContext(), mData);
        listView.setAdapter(adapter);

        findViewById(R.id.dialog_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);
        ab.setIcon(R.mipmap.ic_launcher)
                .setTitle("연습용 다이얼로그")
                .setMessage("연습용 메세지")
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        ab.show();
    }
}
