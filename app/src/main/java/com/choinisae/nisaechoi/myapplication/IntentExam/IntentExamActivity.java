package com.choinisae.nisaechoi.myapplication.IntentExam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class IntentExamActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_exam);

        mEditText = (EditText) findViewById(R.id.next_activity_edt);
        findViewById(R.id.next_activity_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, IntentActivity.class);
        intent.putExtra("text", mEditText.getText().toString());
        startActivity(intent);
    }
}
