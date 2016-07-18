package com.choinisae.nisaechoi.myapplication.exam7_14;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.choinisae.nisaechoi.myapplication.R;
import com.choinisae.nisaechoi.myapplication.fragment.ColorFragment;

public class ExamActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        mTabLayout = (TabLayout) findViewById(R.id.exam_tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.exam_view_pager);

        mTabLayout.setOnTabSelectedListener(this);

        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));

        ExamPagerAdapter pagerAdapter = new ExamPagerAdapter(getSupportFragmentManager());

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mViewPager.setAdapter(pagerAdapter);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_1, ColorFragment.newInstance())
                .commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
