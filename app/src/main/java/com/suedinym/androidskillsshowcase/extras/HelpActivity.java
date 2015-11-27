package com.suedinym.androidskillsshowcase.extras;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.suedinym.androidskillsshowcase.R;

public class HelpActivity extends AppCompatActivity {


    private Typeface font;
    private TextView helpScreenTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        helpScreenTxt = (TextView) findViewById(R.id.helpText);
        font = Typeface.createFromAsset(getAssets(), "fonts/tallpaul.ttf");
        helpScreenTxt.setTypeface(font);
    }

    public void dismiss(View v) {
        finish();
    }

}
