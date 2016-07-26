package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.choinisae.nisaechoi.myapplication.R;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class ChangeActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;
    private TextView mTextView;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        mEditText = (EditText) findViewById(R.id.edit_change);
        mTextView = (TextView) findViewById(R.id.text_change);
        mTextView2 = (TextView) findViewById(R.id.text_change2);


        try (FileWriter file = new FileWriter(getExternalCacheDir().getAbsolutePath())) {
            System.out.println("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }

        findViewById(R.id.text_clear_btn).setOnClickListener(this);

        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTextView.setText(makePhoneNumber(mEditText.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public static String makePhoneNumber(String phoneNumber) {
        String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";

        if (!Pattern.matches(regEx, phoneNumber)) {
            return phoneNumber;
        }
        return phoneNumber.replaceAll(regEx, "$1-$2-$3");

    }

    @Override
    public void onClick(View v) {
        mTextView.setText("");
        mTextView2.setText("");
    }
}
