package com.choinisae.nisaechoi.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.choinisae.nisaechoi.myapplication.IntentExam.IntentActivity;
import com.choinisae.nisaechoi.myapplication.badexam.FirstActivity;
import com.choinisae.nisaechoi.myapplication.database.DataBaseActivity;
import com.choinisae.nisaechoi.myapplication.design.DesignExamActivity;
import com.choinisae.nisaechoi.myapplication.dialog.MyDialog;
import com.choinisae.nisaechoi.myapplication.exam7_11.ExamActivity;
import com.choinisae.nisaechoi.myapplication.exam7_4.ListExamActivity;
import com.choinisae.nisaechoi.myapplication.fragment.ChangeActivity;
import com.choinisae.nisaechoi.myapplication.fragment.FragmentActivity;
import com.choinisae.nisaechoi.myapplication.fragment.NumberChangeActivity;
import com.choinisae.nisaechoi.myapplication.girdview.GridActivity;
import com.choinisae.nisaechoi.myapplication.lifeCycle.LifeCycleActivity;
import com.choinisae.nisaechoi.myapplication.listexam.ListPracticeActivity;
import com.choinisae.nisaechoi.myapplication.memo_fragment.MemoExamActivity;
import com.choinisae.nisaechoi.myapplication.memo_practice.MemoMainActivity;
import com.choinisae.nisaechoi.myapplication.networkcheck.NetworkCheckActivity;
import com.choinisae.nisaechoi.myapplication.scroll_view.ScrollActivity;
import com.choinisae.nisaechoi.myapplication.viewpager.ViewPagerActivity;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by donghaechoi on 2016. 6. 28..
 */
public class MainListActivity extends ListActivity {

    private final static Comparator<Map<String, Object>> sDisplayNameComparator =
            new Comparator<Map<String, Object>>() {
                private final Collator collator = Collator.getInstance();

                public int compare(Map<String, Object> map1, Map<String, Object> map2) {
                    return collator.compare(map1.get("title"), map2.get("title"));
                }
            };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new SimpleAdapter(this, getData(),
                android.R.layout.simple_list_item_1, new String[]{
                "title"
        },
                new int[]{
                        android.R.id.text1
                }));
        getListView().setTextFilterEnabled(true);
    }

    protected List<Map<String, Object>> getData() {
        List<Map<String, Object>> myData = new ArrayList<>();

        // 메뉴 추가 부분
        addItem(myData, "버튼 이벤트", MainActivity.class);
        addItem(myData, "액티비티2", Main2Activity.class);
        addItem(myData, "체크박스", CheckBoxActivity.class);
        addItem(myData, "커피주문앱", CoffeeOrderActivity.class);
        addItem(myData, "안드로이드 기초 시험", AndroidExamActivity.class);
        addItem(myData, "ListActivity", com.choinisae.nisaechoi.myapplication.ListActivity.class);
        addItem(myData, "ListPracticeActivity", ListPracticeActivity.class);
        addItem(myData, "ListExam", ListExamActivity.class);
        addItem(myData, "FabButton", DesignExamActivity.class);
        addItem(myData, "StartActivityForResult", IntentActivity.class);
        addItem(myData, "BadExam", FirstActivity.class);
        addItem(myData, "메모장", MemoMainActivity.class);
        addItem(myData, "생명주기", LifeCycleActivity.class);
        addItem(myData, "안드로이드 ListView 포함 시험", ExamActivity.class);
        addItem(myData, "fragment exam", FragmentActivity.class);
        addItem(myData, "viewPager", ViewPagerActivity.class);
        addItem(myData, "CustomDialog", MyDialog.class);
        addItem(myData, "FragmentExam2", com.choinisae.nisaechoi.myapplication.exam7_14.ExamActivity.class);
        addItem(myData, "FragmentMemo", MemoExamActivity.class);
        addItem(myData, "GridActivity", GridActivity.class);
        addItem(myData, "ScrollView", ScrollActivity.class);
        addItem(myData, "TextWatcher", ChangeActivity.class);
        addItem(myData, "NumberChange", NumberChangeActivity.class);
        addItem(myData, "DataBase Exam1", DataBaseActivity.class);
        addItem(myData, "NetworkCheck", NetworkCheckActivity.class);

        // ----- 메뉴 추가 여기까지

        // 이름 순 정렬
        // Collections.sort(myData, sDisplayNameComparator);

        return myData;
    }

    protected void addItem(List<Map<String, Object>> data, String name, Intent intent) {
        Map<String, Object> temp = new HashMap<>();
        temp.put("title", name);
        temp.put("intent", intent);
        data.add(temp);
    }

    protected void addItem(List<Map<String, Object>> data, String name, Class cls) {
        this.addItem(data, name, new Intent(this, cls));
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Map<String, Object> map = (Map<String, Object>) l.getItemAtPosition(position);

        Intent intent = (Intent) map.get("intent");
        startActivity(intent);
    }
}