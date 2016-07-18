package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.choinisae.nisaechoi.myapplication.R;

public class EditTextFragment extends Fragment implements View.OnClickListener {

    private MyListener myListener;
    private EditText edt;

    public void setOnMyListener(MyListener listener) {
        myListener = listener;
    }

    public EditTextFragment() {
    }

    public static EditTextFragment newInstance() {
        EditTextFragment fragment = new EditTextFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_text, container, false);
        edt = (EditText) view.findViewById(R.id.frag_edt);
        view.findViewById(R.id.frag_btn).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        String a = edt.getText().toString();
        myListener.receiveData(a);
    }
}
