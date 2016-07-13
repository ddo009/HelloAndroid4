package com.choinisae.nisaechoi.myapplication.lifeCycle;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class LifeCycleActivity extends AppCompatActivity {

    private String TAG = LifeCycleActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(LifeCycleActivity.this);
                ab.setTitle("다이얼로그 타이틀 입니다")
                        .setMessage("다이얼로그 메세지 입니다.")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("확인버튼", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(LifeCycleActivity.this, "확인버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("취소버튼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(LifeCycleActivity.this, "취소버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
        Log.d(TAG, "onCreate: 생명주기 테스트");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 생명주기 테스트");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 생명주기 테스트");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 생명주기 테스트");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 생명주기 테스트");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 생명주기 테스트");
    }

}
