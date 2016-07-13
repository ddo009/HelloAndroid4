package com.choinisae.nisaechoi.myapplication.dialog;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class MyDialog extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dialog);

        findViewById(R.id.dialog_view_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        popUpAlertDiaiogWithCustomView();
    }

    private void popUpAlertDiaiogWithCustomView() {
        // AlertDialog 를 쉽게 만들도록 도와주는 AlertDialog.Builder
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // CustomView 를 세팅하여 사용되는 경우 Inflater 를 이용하여 View 를 inflate 해야한다.
        View innerView = getLayoutInflater().inflate(R.layout.layout_dialog, null);
        // inflate 한 CustomView 를 세팅하는 메소드
        builder.setView(innerView);
        // 팝업된 AlertDialog 가 다른 곳을 클릭했을 때 닫히지 않도록 설정하는 메소드
        builder.setCancelable(false);

        /**
         * CustomView 에 위치한 View 들을 객체화하는 부분
         */
        final EditText editText1 = (EditText) innerView.findViewById(R.id.et_1);
        final EditText editText2 = (EditText) innerView.findViewById(R.id.et_2);
        Button closeButton = (Button) innerView.findViewById(R.id.btn_close);
        Button loginButton = (Button) innerView.findViewById(R.id.btn_login);


        // 다이얼로그 빌더에 세팅한 여러가지 값이 적용된 AlertDialog 객체를 만드는 부분
        final AlertDialog dialog = builder.create();
        // 그렇게 만들어진 AlertDialog 객체를 화면에 출력하는 부분
        dialog.show();

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyDialog.this, "닫기 버튼이 눌렸습니다!", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editText1.getText().toString();
                String pw = editText2.getText().toString();
                if ("admin".equals(id) && "admin".equals(pw)) {
                    Toast.makeText(MyDialog.this, "로그인에 성공하셨습니다!", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                } else {
                    Toast.makeText(MyDialog.this, "아이디 또는 비밀번호가 일치하지 않습니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
