package com.suedinym.androidskillsshowcase;

import android.app.Application;

/**
 * Created by sue on 11/22/15.
 */
public class App extends Application {
    private static App sInstance;


    public static App getInstance(){
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}
