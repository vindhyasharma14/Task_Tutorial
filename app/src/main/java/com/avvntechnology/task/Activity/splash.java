package com.avvntechnology.task.Activity;

/**
 * Created by VINDHYA on 13-May-17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.avvntechnology.task.R;

/**
 * Created by VINDHYA on 11-May-17.
 */

public class splash extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //adding before setContentView for full screen a_splash
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                startActivity();
                finish();

            }
        }).start();

    }

    private void startActivity() {
        startActivity(new Intent(splash.this,A_HomeActivity.class));

    }


}