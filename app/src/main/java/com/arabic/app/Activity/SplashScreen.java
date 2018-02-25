package com.arabic.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.arabic.app.Network.AppController;
import com.arabic.app.Network.SavePref;
import com.arabic.app.R;
import com.arabic.app.Tamrin_Class.Hashtm.tarjome_sazi_1.Tarmrin_8_class_1;

public class SplashScreen extends AppCompatActivity {

    private Thread mSplashThread;
    SavePref save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        save = new SavePref(this);
        save.save(AppController.SAVE_RANK, 0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,DarsActivity.class));

                //startActivity(new Intent(SplashScreen.this,Tarmrin_8_class_1.class));
                //startActivity(new Intent(SplashScreen.this,LoginActivity.class));
                //startActivity(new Intent(SplashScreen.this,TainSathActivity.class));
                finish();
            }
        },100);
    }

}