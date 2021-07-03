package com.badoualy.stepperindicator.sample;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1, position == getCount() - 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}