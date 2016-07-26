package com.choinisae.nisaechoi.myapplication.database;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;
import com.choinisae.nisaechoi.myapplication.database.facade.MyFacade;

public class DataBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTitle;
    private EditText mContent;
    private MyFacade mFacade;
    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);

        mFacade = new MyFacade(getApplicationContext());
        mTitle = (EditText) findViewById(R.id.data_title);
        mContent = (EditText) findViewById(R.id.data_content);
        mResult = (TextView) findViewById(R.id.data_result_txt);
        findViewById(R.id.data_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String title = mTitle.getText().toString();
        String content = mContent.getText().toString();
        if (!title.isEmpty() && !content.isEmpty()) {
            mFacade.insertDb(title, content);
            Cursor cursor = mFacade.queryAllData();
            mResult.setText("");
            while (cursor.moveToNext()) {
                Datas datas = Datas.cursorToMove(cursor);
                mResult.setText(datas.getTitle() + "\n" +
                        datas.getContent());
            }
        } else {
            Toast.makeText(DataBaseActivity.this, "빈 값 없이 입력해주세요.", Toast.LENGTH_SHORT).show();
        }
    }
}
