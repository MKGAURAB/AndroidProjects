package com.askyou;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Start extends Activity implements OnClickListener{
	public static ProgressBar bar;
	static String ques[] = { "What is your name?",
			"Which of the following number is Palindromic?",
			"Which one is heavier?",
			"Which one is an amphibian?",
			"Which of the following number is prime?",
			"Helsinky is the capital city of?",
			"Which of the following is a missile?",
			"Which of the following is the kernel of Android?",
			"Who is the creator of Windows?",
			"Who is creator of Apple corp.?",
			"Who is Newton?",
			"When did Bangladesh liberated from Pakistan?"
			};
	static String ans[] = { "None of the below", "Ram", "Sam", "Jodu",
		"121", "211","245", "293",
		"Iron", "Water","Milk", "Cotton",
		"Toad", "Crocodile", "Hippo", "Tiger",
		"1","22", "42", "2",
		"Norway", "Holand", "Finland", "Germany",
		"Scud", "Bing", "Baidu", "Yahoo",
		"Linux", "DOS", "Unix", "Fedora",
		"Bill Gates", "Steve Jobs", "Linus Trovald", "Dan Bilzerin",
		"Bill Gates", "Steve Jobs", "Linus Trovald", "Dan Bilzerin",
		"Physicist", "Physician", "Oncologist", "Dentist",
		"1971", "1972", "1952", "1947"
		};
	static int flag[] = { 1, 1, 1, 1, 4, 3, 1, 1, 1, 2, 1, 1};
	static ArrayList<Integer> arr = new ArrayList<Integer>(20);
	public ArrayList<Integer> wa = new ArrayList<Integer>(3);
	public static int prg = 0;
	public int rans, pos, cnt, cans;

	public static int ret() {
		int len = ques.length;
		if(arr.size()== len || arr.size()==len-1) return -1;
		int res = (int) (Math.random() * (len-1));
		while (arr.contains(res)) {
			res = (int) (Math.random() * (len-1));
		}
		arr.add(res);
		return res;
	}

	public void recereate() {
		pos = ret();
		boolean tflag = true;
		int tlen = wa.size();
		if(tlen==3){
			for(int i=1; i<3; i++){
				if((wa.get(i-1)+1)!=wa.get(i)){
					tflag = false;
				}
			}
			wa.clear();
		}
		else tflag = false;
		if(tflag){
			AlertDialog.Builder alt = new AlertDialog.Builder(this);
			alt.setMessage("Sorry! Better luck next time.");
			alt.setPositiveButton("OK", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					startActivity(new Intent(getApplicationContext(),MainActivity.class));
					finish();
				}
			});
			AlertDialog alart = alt.create();
			alart.show();
			return ;
		}
		if(pos==-1)
		{
			AlertDialog.Builder alt = new AlertDialog.Builder(this);
			alt.setMessage("Congratulations! You won the game.");
			alt.setPositiveButton("OK", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					startActivity(new Intent(getApplicationContext(),MainActivity.class));
					finish();
				}
			});
			AlertDialog alart = alt.create();
			alart.show();
			return ;
		}
		rans = flag[pos];
		tv.setText(ques[pos]);
		scr.setText("Score: "+cans);
		pos *= 4;
		cb1.setText(ans[pos++]);
		cb2.setText(ans[pos++]);
		cb3.setText(ans[pos++]);
		cb4.setText(ans[pos++]);
		cb1.setChecked(false);
		cb2.setChecked(false);
		cb3.setChecked(false);
		cb4.setChecked(false);
	}

	public static TextView tv, scr;
	public static CheckBox cb1, cb2, cb3, cb4;
	public static Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		arr.clear();
		wa.clear();
		cnt=cans=0;
	
		tv = (TextView) findViewById(R.id.textView2);
		scr = (TextView) findViewById(R.id.textView4);
		cb1 = (CheckBox) findViewById(R.id.checkBox1);
		cb2 = (CheckBox) findViewById(R.id.checkBox2);
		cb3 = (CheckBox) findViewById(R.id.checkBox3);
		cb4 = (CheckBox) findViewById(R.id.checkBox4);
		btn = (Button) findViewById(R.id.strext1);
		btn.setOnClickListener(this);
		cb1.setOnClickListener(this);
		cb2.setOnClickListener(this);
		cb3.setOnClickListener(this);
		cb4.setOnClickListener(this);
		cb1.setChecked(false);
		cb2.setChecked(false);
		cb3.setChecked(false);
		cb4.setChecked(false);
		recereate();

	}

	@Override
	public void onClick(View V) {
		// TODO Auto-generated method stub
		cnt++;
		if (V.getId() == R.id.checkBox1) {
			if (rans == 1) {
				cans++;
				Toast.makeText(getBaseContext(), "Correct Answer!!!",
						Toast.LENGTH_SHORT).show();
				recereate();
			} else {
				Toast.makeText(getBaseContext(), "Wrong Answer!!!",
						Toast.LENGTH_SHORT).show();
				wa.add(cnt);
				arr.remove(arr.size()-1);
				recereate();
			}
		} else if (V.getId() == R.id.checkBox2) {
			if (rans == 2) {
				cans++;
				Toast.makeText(getBaseContext(), "Correct Answer!!!",
						Toast.LENGTH_SHORT).show();
				recereate();
			} else {
				Toast.makeText(getBaseContext(), "Wrong Answer!!!",
						Toast.LENGTH_SHORT).show();
				wa.add(cnt);
				arr.remove(arr.size()-1);
				recereate();
			}

		} else if (V.getId() == R.id.checkBox3) {
			if (rans == 3) {
				cans++;
				Toast.makeText(getBaseContext(), "Correct Answer!!!",
						Toast.LENGTH_SHORT).show();
				recereate();
			} else {
				Toast.makeText(getBaseContext(), "Wrong Answer!!!",
						Toast.LENGTH_SHORT).show();
				wa.add(cnt);
				arr.remove(arr.size()-1);
				recereate();
			}
		} else if (V.getId() == R.id.checkBox4) {
			if (rans == 4) {
				cans++;
				Toast.makeText(getBaseContext(), "Correct Answer!!!",
						Toast.LENGTH_SHORT).show();
				recereate();
			} else {
				Toast.makeText(getBaseContext(), "Wrong Answer!!!",
						Toast.LENGTH_SHORT).show();
				wa.add(cnt);
				arr.remove(arr.size()-1);
				recereate();
			}
		} else if (V.getId() == R.id.strext1) {
			startActivity(new Intent(getApplicationContext(),
					MainActivity.class));
			finish();
		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stud

		AlertDialog.Builder alt = new AlertDialog.Builder(this);
		alt.setMessage("You can't go Back");
		alt.setPositiveButton("OK", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {

			}
		});
		AlertDialog alart = alt.create();
		alart.show();

	}
}
