package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.choinisae.nisaechoi.myapplication.R;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                addFragment(R.id.frag1);
                break;
            case R.id.button2:
                addFragment(R.id.frag2);
                break;
            case R.id.button3:
                addFragment(R.id.frag3);
                break;
        }
    }

    private void addFragment(int id) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(id, ColorFragment.newInstance())
                .commit();

    }
}
