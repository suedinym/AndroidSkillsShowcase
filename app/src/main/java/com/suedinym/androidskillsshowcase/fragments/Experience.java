package com.suedinym.androidskillsshowcase.fragments;

/**
 * Created by sue on 11/22/15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.suedinym.androidskillsshowcase.R;




public  class Experience extends Fragment {
    private TextView mWebLink;
    private TextView mPlayStoreLink;

//todo figure out how to hook up website and play store

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        View rootView = inflater.inflate(R.layout.experience, container, false);
        return rootView;

      /*  mWebLink = (TextView) container.findViewById(R.id.websiteTextView);
        mWebLink.setMovementMethod(LinkMovementMethod.getInstance());*/
    }




}
