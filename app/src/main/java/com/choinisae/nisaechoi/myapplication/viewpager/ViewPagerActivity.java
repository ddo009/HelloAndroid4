package com.choinisae.nisaechoi.myapplication.viewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.choinisae.nisaechoi.myapplication.R;

public class ViewPagerActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private MyFragmentPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);

        // Tab 설정
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab 4"));

        // Tab 리스너 설정
        mTabLayout.setOnTabSelectedListener(this);

        // Adapter
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());

        // View 에 Adapter 붙이기
        mViewPager.setAdapter(mAdapter);

        // ViewPager 와 TabLayout연결
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        // Tab을 선택했을 때 ViewPager 의 페이지를 이동
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        // 탭 선택이 해제됐을때
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
        // 탭이 재선택 되었을때.
    }
}
