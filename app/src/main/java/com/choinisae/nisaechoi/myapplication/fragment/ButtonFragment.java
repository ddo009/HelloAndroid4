package com.choinisae.nisaechoi.myapplication.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class ButtonFragment extends Fragment {

    public ButtonFragment() {
    }

    public static ButtonFragment newInstance() {
        ButtonFragment fragment = new ButtonFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_button, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.fragment_dialog_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab = new AlertDialog.Builder(getContext());
                ab.setMessage("다이얼로그 메세지 입니다.")
                        .setTitle("다이얼로그 타이틀 입니다")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("확인버튼", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "확인버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
                            }
                        }).setNegativeButton("취소버튼", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "취소버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });

    }
}
