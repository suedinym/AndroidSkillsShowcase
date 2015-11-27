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
// TODO: 11/27/15 fix the string so it fits on the page
public class Mission extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mission, container, false);

        return rootView;
    }
}
