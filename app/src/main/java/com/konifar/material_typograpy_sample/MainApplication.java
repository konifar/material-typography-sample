package com.konifar.material_typograpy_sample;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // If you want to set default font, activate this code below.
        // initCalligraphy();
    }

    private void initCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath(getString(R.string.font_roboto_medium))
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }

}
