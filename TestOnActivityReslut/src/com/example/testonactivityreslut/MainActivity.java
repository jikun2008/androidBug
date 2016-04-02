package com.example.testonactivityreslut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	private final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	/**
	 * 去启动模式为standard的Activity
	 * 
	 * @param view
	 */
	public void toStandardActivity(View view) {
		Intent intent = new Intent(this, StandardActivity.class);

		startActivityForResult(intent, 8);// requestCode= 8, If requestCode>= 0,
											// this code will be returned in
											// onActivityResult() when the
											// activity exits.

	}

	/**
	 * 去启动模式为singleTop的Activity
	 * 
	 * @param view
	 */
	public void toSingleTopActivity(View view) {
		Intent intent = new Intent(this, SingleTopActivity.class);

		startActivityForResult(intent, 8);// requestCode= 8, If requestCode>= 0,
											// this code will be returned in
											// onActivityResult() when the
											// activity exits.

	}

	/**
	 * 去启动模式为singleTask的Activity
	 * 
	 * @param view
	 */
	public void toSingleTaskActivity(View view) {
		Intent intent = new Intent(this, SingleTaskActivity.class);

		startActivityForResult(intent, 8);// requestCode= 8, If requestCode>= 0,
											// this code will be returned in
											// onActivityResult() when the
											// activity exits.
	}

	/**
	 * 去启动模式为singleInstance的Activity
	 * 
	 * @param view
	 */
	public void toSingleInstanceActivity(View view) {
		Intent intent = new Intent(this, SingleInstanceActivity.class);

		startActivityForResult(intent, 8);// requestCode= 8, If requestCode>= 0,
											// this code will be returned in
											// onActivityResult() when the
											// activity exits.
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (resultCode==Activity.RESULT_CANCELED) {
			
		}
		Log.d(TAG, TAG + "requestCode=" + requestCode + "----resultCode="
				+ resultCode);

	}
}
