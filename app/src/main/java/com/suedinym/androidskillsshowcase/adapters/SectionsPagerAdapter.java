package com.suedinym.androidskillsshowcase.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.suedinym.androidskillsshowcase.fragments.TabFour;
import com.suedinym.androidskillsshowcase.fragments.TabOne;
import com.suedinym.androidskillsshowcase.fragments.TabThree;
import com.suedinym.androidskillsshowcase.fragments.TabTwo;

/**
 * Created by sue on 11/22/15.
 */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return new TabOne();
                case 1:
                    return new TabTwo();
                case 2:
                    return new TabThree();
                case 3:
                    return new TabFour();
            }
return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Tab 1";
                case 1:
                    return "Tab 2";
                case 2:
                    return "Tab 3";
                case 3:
                    return "Tab 4";
            }
            return null;
        }
    }

