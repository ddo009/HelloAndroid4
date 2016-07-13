package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.choinisae.nisaechoi.myapplication.R;

public class EditTextFragment extends Fragment {

    public EditTextFragment() {
    }

    public static EditTextFragment newInstance() {
        EditTextFragment fragment = new EditTextFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit_text, container, false);
    }
}
