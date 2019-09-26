package com.zknapps.urdukeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import com.github.ybq.android.spinkit.style.FadingCircle;



public class SplashActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar=findViewById(R.id.spinkit);
        FadingCircle fadingCircle=new FadingCircle();
        progressBar.setIndeterminateDrawable(fadingCircle);

        Thread splash=new Thread(){
            public void run(){
                try {
                    sleep(3*1000);
                    Intent i=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }catch (Exception e){

                }
            }
        };splash.start();
    }
}
