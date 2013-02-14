package edu.drake.androidactivities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AlexActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alex);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_alex, menu);
		return true;
	}

}
