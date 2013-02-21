package edu.drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


// here is a commenet  
public class PhillipActivity extends Activity {

	private static final String TAG = "PhillipActivity";
	
	Button buttonA;
	Button buttonR;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phillip);
		
		buttonA = (Button) findViewById(R.id.button1);
		buttonA.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				//code put here will be executed when clicked
			Log.v(TAG, "button pressed");
			Intent intent = new Intent(v.getContext(), AlexActivity.class);
			startActivity(intent);
			}
		});
		
		buttonR = (Button) findViewById(R.id.button2);
		buttonR.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v)
			{		
				// code will be executed when this button is clicked
				Log.v(TAG, "button pressed");
				Intent intent2 = new Intent(v.getContext(), MainActivity.class);
				startActivity(intent2);
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_phillip, menu);
		return true;
	}

}
