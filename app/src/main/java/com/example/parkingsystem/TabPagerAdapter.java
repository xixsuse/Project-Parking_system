package com.example.parkingsystem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/*flagment Array*/
class FragmentInfo {
    private int iconResId;
    private String text;
    private Fragment fragment;

    public FragmentInfo(int iconResId, String text, Fragment fragment) {
        this.iconResId = iconResId;
        this.text = text;
        this.fragment = fragment;
    }

    public int getIconResId() {
        return iconResId;
    }

    public String getTitleText() {
        return text;
    }

    public Fragment getFragment() {
        return fragment;
    }
}

public class TabPagerAdapter extends FragmentPagerAdapter {
    //private static int PAGE_NUMBER = 3;
    private final List<FragmentInfo> FragmentInfoArr = new ArrayList<FragmentInfo>();


    public TabPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public FragmentInfo getFragmentInfo(int position){
        return FragmentInfoArr.get(position);
    }
    public void add(int iconId, String title, Fragment fragment){
        FragmentInfo tmp = new FragmentInfo(iconId, title, fragment);
        FragmentInfoArr.add(tmp);
    }
    @Override
    public Fragment getItem(int position) {
        return FragmentInfoArr.get(position).getFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentInfoArr.get(position).getTitleText();
    }

    @Override
    public int getCount() {
        return FragmentInfoArr.size();
    }
}

