package com.recyclingideas.insideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    //   String[] tabarray = new String[]{"HOME","SEARCH","POST","PROFIL"};

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return null;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Home home = new Home();
                return home;

            case 1:
                Search search = new Search();
                return search;

            case 2:
                Post post = new Post();
                return post;
            case 3:
                Profil profil = new Profil();
                return profil;
        }
        return null;

    }

    @Override
    public int getCount() {

        return 4;
    }


}