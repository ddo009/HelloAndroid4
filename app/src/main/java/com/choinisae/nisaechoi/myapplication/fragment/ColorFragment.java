package com.choinisae.nisaechoi.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.choinisae.nisaechoi.myapplication.R;

public class ColorFragment extends Fragment {


    private TextView colorTextView;

    public ColorFragment() {
    }

    // TODO: Rename and change types and number of parameters
    public static ColorFragment newInstance() {
        ColorFragment fragment = new ColorFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        colorTextView = (TextView) view.findViewById(R.id.frag_text_view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void receiveDataFromActivity(int color) {
        Toast.makeText(FragmentActivity.ac, "칼라가 넘어 왔습니다" + color, Toast.LENGTH_SHORT).show();
        colorTextView.setBackgroundColor(color);
    }

}
