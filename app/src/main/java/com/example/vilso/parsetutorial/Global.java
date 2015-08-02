package com.example.vilso.parsetutorial;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by vilso on 01/08/2015.
 */
public class Global extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "y91pZjby19jjYb5o3nIRL8mF41zI0uPJi8y0hzSY", "zNzlE3hmY7AHZlsWRIpJxpHsEo5bhhd7gQbn2y4d");

    }
}
