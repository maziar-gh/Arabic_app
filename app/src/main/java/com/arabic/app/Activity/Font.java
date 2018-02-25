package com.arabic.app.Activity;

import android.app.Application;

import com.arabic.app.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by zp on 2/25/2018.
 */

public class Font extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/IRANSans_Medium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

    }
}