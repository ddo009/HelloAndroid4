package com.choinisae.nisaechoi.myapplication.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener, MyListener {

    public static Context ac;
    private ColorFragment fragment1;
    private ColorFragment fragment2;
//    private ColorFragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        ac = getApplicationContext();

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

        fragment1 = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.frag1);
        fragment2 = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.frag2);
//        fragment3 = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.frag3);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                fragment1.receiveDataFromActivity(Color.RED);
                break;
            case R.id.button2:
                fragment2.receiveDataFromActivity(Color.BLUE);
                break;
            case R.id.button3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frag3, ColorFragment.newInstance())
                        .commit();
                break;
        }
    }

    @Override
    public void receiveData(String str) {
        Toast.makeText(FragmentActivity.this, "" + str, Toast.LENGTH_SHORT).show();
    }
}
