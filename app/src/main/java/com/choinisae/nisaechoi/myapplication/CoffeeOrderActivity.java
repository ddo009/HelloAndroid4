package com.choinisae.nisaechoi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class CoffeeOrderActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private int mPay = 1500;
    private int mOrder = 0;
    private TextView mOrderTextView;
    private EditText mNameEdt;
    private CheckBox mCreamBox;
    private TextView mResultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_order);

        mCreamBox = (CheckBox) findViewById(R.id.cream_checkbox);
        mCreamBox.setOnCheckedChangeListener(this);

        mOrderTextView = (TextView) findViewById(R.id.order_textview);

        Button minusBtn = (Button) findViewById(R.id.minus_btn);
        Button plusBtn = (Button) findViewById(R.id.plus_btn);

        minusBtn.setOnClickListener(this);
        plusBtn.setOnClickListener(this);

        Button completeBtn = (Button) findViewById(R.id.order_btn);
        completeBtn.setOnClickListener(this);

        mNameEdt = (EditText) findViewById(R.id.name_edt_text);
        mResultTxt = (TextView) findViewById(R.id.result_text_view);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.isChecked()) {
            mPay = 2000;
        } else {
            mPay = 1500;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.minus_btn:
                if (mOrder > 0) {
                    mOrder--;
                    mOrderTextView.setText("" + mOrder);
                }
                break;
            case R.id.plus_btn:
                mOrder++;
                mOrderTextView.setText("" + mOrder);
                break;
            case R.id.order_btn:
                /**
                 * 주문 요약
                 * 이름 : mNameEdt.getText.toString
                 * 수량 : mOrder
                 * 휘핑크림 추가 여부 : mCreamBox.isChecked
                 * 합계 : mPay * mOrder
                 */
                mResultTxt.setText("주문 요약\n이름 : " + mNameEdt.getText().toString() + "\n수량 : "
                        + mOrder + "\n휘핑크림 추가 여부 : " + mCreamBox.isChecked() + "\n합계 : " + (mPay * mOrder));
                mResultTxt.setVisibility(View.VISIBLE);
                break;
        }
    }
}
