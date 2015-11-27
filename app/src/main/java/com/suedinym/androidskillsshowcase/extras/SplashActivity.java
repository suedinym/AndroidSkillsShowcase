package com.suedinym.androidskillsshowcase.extras;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.suedinym.androidskillsshowcase.R;
import com.suedinym.androidskillsshowcase.ui.MainActivity;

/**
 * Created by sue on 11/23/15.
 */
public class SplashActivity extends AppCompatActivity {
    private Typeface font;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        text1 = (TextView) findViewById(R.id.splashTxt);
        font = Typeface.createFromAsset(getAssets(), "fonts/sigv.ttf");
        text1.setTypeface(font);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent openMainActivity= new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

