package com.suedinym.androidskillsshowcase.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.suedinym.androidskillsshowcase.R;
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
    protected Context mContext;



    public SectionsPagerAdapter(Context context, FragmentManager fm) {
                super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
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

        return 4;
    }

    private int[] imageResId = {
            R.drawable.ic_about,
            R.drawable.ic_mission,
            R.drawable.ic_exp,
            R.drawable.ic_edu
    };
    @Override
    public CharSequence getPageTitle(int position) {

        Drawable image = ContextCompat.getDrawable(mContext, imageResId[position]);
       
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" ");
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }

  /*  @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.about_title);
            case 1:
                return mContext.getString(R.string.mission_title);
            case 2:
                return mContext.getString(R.string.exp_title);
            case 3:
                return mContext.getString(R.string.edu_title);
        }
        return null;



    }*/


}










