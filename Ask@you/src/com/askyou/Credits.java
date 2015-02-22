package com.askyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Credits extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credits);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		startActivity(new Intent(getApplicationContext(),MainActivity.class));
		finish();
	}
}
