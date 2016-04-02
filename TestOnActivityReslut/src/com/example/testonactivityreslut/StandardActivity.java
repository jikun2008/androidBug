package com.example.testonactivityreslut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StandardActivity extends Activity {
	private final String TAG = StandardActivity.class.getSimpleName();
	private TextView showTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all);
		showTv = (TextView) findViewById(R.id.showTv);
		showTv.setText(TAG);
	}

	public void close(View view) {

		setResult(99);
		finish();

	}
}