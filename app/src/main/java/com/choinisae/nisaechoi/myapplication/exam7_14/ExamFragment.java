package com.choinisae.nisaechoi.myapplication.exam7_14;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.choinisae.nisaechoi.myapplication.R;

import java.util.ArrayList;

public class ExamFragment extends Fragment {

    public ExamFragment() {
    }

    public static ExamFragment newInstance() {
        ExamFragment fragment = new ExamFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exam, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = (ListView) view.findViewById(R.id.exam_frament_list_view);
        ArrayList<Models> arrayList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            arrayList.add(new Models((char) i));
        }
        ExamAdapter adapter = new ExamAdapter(getContext(), arrayList);
        listView.setAdapter(adapter);
    }
}