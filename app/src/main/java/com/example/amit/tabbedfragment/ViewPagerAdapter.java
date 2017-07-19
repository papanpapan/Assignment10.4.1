package com.example.amit.tabbedfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Amit on 6/28/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment>fragments=new ArrayList<>();
    ArrayList<String>tabTitles=new ArrayList<>();
    public void addFragments(Fragment fragments,String tabTitles){
        this.fragments.add(fragments);
        this.tabTitles.add(tabTitles);

    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
