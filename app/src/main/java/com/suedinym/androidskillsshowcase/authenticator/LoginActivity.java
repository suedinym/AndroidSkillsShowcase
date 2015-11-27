package com.suedinym.androidskillsshowcase.authenticator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.suedinym.androidskillsshowcase.R;
import com.suedinym.androidskillsshowcase.extras.HelpActivity;


/**
 * Created by sue on 11/27/15.
 */
public class LoginActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    protected TextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // launches help screen -only once
        prefs = getPreferences(Context.MODE_PRIVATE);
        if (prefs.getBoolean("firstLaunch", true)) {
            prefs.edit().putBoolean("firstLaunch", false).apply();
            startActivity(new Intent(getApplicationContext(), HelpActivity.class));

            //dummy content
           // populate();
        }

        mSignUpTextView = (TextView)findViewById(R.id.buttonSignUp);
        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
    //// TODO: 11/27/15 hook this up in a mock setup



}
