package com.choinisae.nisaechoi.myapplication.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.choinisae.nisaechoi.myapplication.fragment.ButtonFragment;
import com.choinisae.nisaechoi.myapplication.fragment.ColorFragment;
import com.choinisae.nisaechoi.myapplication.fragment.EditTextFragment;

/**
 * Created by donghaechoi on 2016. 7. 12..
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public static final int PAGE_COUNT = 4;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return ButtonFragment.newInstance();
            case 1:
                return EditTextFragment.newInstance();
            case 2:
                return ButtonFragment.newInstance();
            case 3:
                return ColorFragment.newInstance();
            default:
                return ColorFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
