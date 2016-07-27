package com.choinisae.nisaechoi.myapplication.networkcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class NetworkCheckActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = NetworkCheckActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_check);

        findViewById(R.id.network_check_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int networkCheck = NetworkUtil.getConnectivityStatus(getApplicationContext());
        if (networkCheck == NetworkUtil.CONNECTED) {
            Toast.makeText(NetworkCheckActivity.this, "연결되었습니다.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(NetworkCheckActivity.this, "인터넷 연결 상태를 확인해주세요", Toast.LENGTH_SHORT).show();
            finish();
        }
    }


}
