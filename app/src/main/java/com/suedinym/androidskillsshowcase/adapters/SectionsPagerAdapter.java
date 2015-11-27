package com.suedinym.androidskillsshowcase.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.suedinym.androidskillsshowcase.fragments.Education;
import com.suedinym.androidskillsshowcase.fragments.AboutMe;
import com.suedinym.androidskillsshowcase.fragments.Experience;
import com.suedinym.androidskillsshowcase.fragments.Mission;

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
                    return new AboutMe();
                case 1:
                    return new Mission();
                case 2:
                    return new Experience();
                case 3:
                    return new Education();
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
                    return "About";
                case 1:
                    return "Mission";
                case 2:
                    return "Exp";
                case 3:
                    return "Edu";
            }
            return null;
        }
    }

