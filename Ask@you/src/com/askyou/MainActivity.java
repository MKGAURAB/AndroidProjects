package com.askyou;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button bt1, bt2, bt3, bt4;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1 = (Button)findViewById(R.id.button1);
		bt2 = (Button)findViewById(R.id.button2);
		bt3 = (Button)findViewById(R.id.button3);
		bt4 = (Button)findViewById(R.id.button4);
		
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
		bt4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button1)
		{
			startActivity( new Intent(getApplicationContext(),Start.class));
			finish();
		}
		else if(v.getId()==R.id.button2)
		{
			startActivity( new Intent(getApplicationContext(),Credits.class));
			finish();
		}
		else if(v.getId()==R.id.button3){
			startActivity(new Intent(getApplicationContext(),Help.class));
			finish();
		}
		else{
			
			finish();
		}
		
	}

}
