package com.choinisae.nisaechoi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextView mTextView1;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox_1);
        checkBox1.setOnCheckedChangeListener(this);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox_2);
        checkBox2.setOnCheckedChangeListener(this);

        mTextView1 = (TextView) findViewById(R.id.text_view_1);
        mTextView2 = (TextView) findViewById(R.id.text_view_2);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.checkbox_1:
                if (compoundButton.isChecked()) {
                    mTextView1.setVisibility(View.VISIBLE);
                } else {
                    mTextView1.setVisibility(View.GONE);
                }
                break;
            case R.id.checkbox_2:
                if (compoundButton.isChecked()) {
                    mTextView2.setVisibility(View.VISIBLE);
                } else {
                    mTextView2.setVisibility(View.GONE);
                }
                break;
        }
    }
}
