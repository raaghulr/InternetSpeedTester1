package com.raaghulr.rr.internetspeedtester;

import android.app.Application;

/**
 * Created by RR on 03-03-2017.
 */

public class MyApp extends Application {
// Put the onCreate code as you obtained from the post link you reffered
@Override
public void onCreate() {
    super.onCreate();
    TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/your_font_file.ttf");
}
}