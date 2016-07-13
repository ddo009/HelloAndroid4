package com.choinisae.nisaechoi.myapplication.design;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class DesignExamActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_exam);

        FloatingActionButton fabButton = (FloatingActionButton) findViewById(R.id.fab_button);
        fabButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder ab = new AlertDialog.Builder(this);

        ab.setMessage("다이얼로그 메세지 입니다.")
                .setTitle("다이얼로그 타이틀 입니다")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("확인버튼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DesignExamActivity.this, "확인버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("취소버튼", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DesignExamActivity.this, "취소버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
}
