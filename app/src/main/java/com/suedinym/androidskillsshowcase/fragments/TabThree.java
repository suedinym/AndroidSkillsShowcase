package com.suedinym.androidskillsshowcase.fragments;

/**
 * Created by sue on 11/22/15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.suedinym.androidskillsshowcase.R;


public  class TabThree extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_three, container, false);
             return rootView;
    }
}
