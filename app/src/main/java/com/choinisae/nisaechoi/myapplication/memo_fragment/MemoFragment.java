package com.choinisae.nisaechoi.myapplication.memo_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class MemoFragment extends Fragment {

    private MemoInterfaceListener mListener;

    private EditText mTitle;
    private EditText mContent;

    public void setmListener(MemoInterfaceListener listener) {
        mListener = listener;
    }

    public MemoFragment() {
    }

    public static MemoFragment newInstance() {
        MemoFragment fragment = new MemoFragment();
        return fragment;
    }
        // 네이버 지식인 nisaeChoi

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_memo, container, false);
        mTitle = (EditText) view.findViewById(R.id.fragment_memo_title);
        mContent = (EditText) view.findViewById(R.id.fragment_memo_content);
        view.findViewById(R.id.fragment_memo_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = mTitle.getText().toString();
                String content = mContent.getText().toString();
                mListener.receiveData(title, content);
            }
        });
        return view;
    }

}
