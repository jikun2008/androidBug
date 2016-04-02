package com.example.testonactivityreslut;

import android.app.Application;
import android.util.Log;

public class MainAppcation extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.d("MainAppcation", "MainAppcation--" + "onCreate");
	}
}
