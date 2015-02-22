package com.askyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Help extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent in = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(in);
		finish();
	}
}
