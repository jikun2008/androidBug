package com.example.testframentactiivty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Fragment fragment = new TestFrament();
		FragmentTransaction transaction =
			getSupportFragmentManager().beginTransaction().replace(R.id.ll_linearlayout, fragment);
		transaction.commitAllowingStateLoss();
	}
	
}
