package com.suedinym.androidskillsshowcase.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.suedinym.androidskillsshowcase.R;


/**
 * Created by sue on 11/23/15.
 */
public class TabTwo extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_two, container, false);

        return rootView;
    }
}
