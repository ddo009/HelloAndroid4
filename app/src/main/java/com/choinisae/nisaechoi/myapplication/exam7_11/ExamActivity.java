package com.choinisae.nisaechoi.myapplication.exam7_11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class ExamActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mIdEdit;
    private EditText mPasswordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        mIdEdit = (EditText) findViewById(R.id.id_edit_text);
        mPasswordEdit = (EditText) findViewById(R.id.password_edit_text);

        findViewById(R.id.login_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (mIdEdit.getText().toString().equals("admin") && mPasswordEdit.getText().toString().equals("admin")) {
            Intent intent = new Intent(this, ExamSecondActivity.class);
            intent.putExtra("admin", "admin");
            startActivity(intent);
        } else {
            Toast.makeText(ExamActivity.this, "아이디나 비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
