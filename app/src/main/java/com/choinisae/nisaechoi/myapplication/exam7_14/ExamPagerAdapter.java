package com.choinisae.nisaechoi.myapplication.exam7_14;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.choinisae.nisaechoi.myapplication.fragment.ButtonFragment;
import com.choinisae.nisaechoi.myapplication.fragment.ColorFragment;

/**
 * Created by donghaechoi on 2016. 7. 14..
 */
public class ExamPagerAdapter extends FragmentPagerAdapter {
    public static final int PAGE_COUNT = 3;

    public ExamPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExamFragment.newInstance();
            case 1:
                return ColorFragment.newInstance();
            case 2:
                return ButtonFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
