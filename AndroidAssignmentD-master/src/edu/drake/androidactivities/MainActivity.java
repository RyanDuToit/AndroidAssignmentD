package edu.drake.androidactivities;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.*;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends Activity {
	Button buttonAlex;
	Button buttonPhillip;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonAlex = (Button) findViewById(R.id.button1); //initialize button for alex
		buttonPhillip = (Button) findViewById(R.id.button2); //initialize button for Phillip
		
		buttonAlex.setOnClickListener(new OnClickListener() { //set listener for alex
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), AlexActivity.class); //when clicked, pull up an instance of alex's activity
				startActivity(intent);
			}
		});
		
		
		buttonPhillip.setOnClickListener(new OnClickListener() { //set listener for Phillip
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), PhillipActivity.class); //when clicked pull up an instance of Phillip's activity
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
