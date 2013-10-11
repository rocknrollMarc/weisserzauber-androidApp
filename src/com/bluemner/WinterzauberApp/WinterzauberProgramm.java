package com.bluemner.WinterzauberApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class WinterzauberProgramm extends Activity{

	RelativeLayout widget160;
	ScrollView widget161;
	LinearLayout widget162;
	TextView widget163;
	TextView widget164;
	TextView widget165;
	TextView widget166;
	TextView widget167;
	TextView widget168;
	TextView widget169;
	TextView widget170;
	TextView widget171;
	TextView widget172;
	TextView widget173;
	TextView widget174;
	TextView widget175;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programm);
        initUIElements();
       
	}
	
	private void initUIElements() {
		widget160 = (RelativeLayout) findViewById(R.id.widget160);
		widget161 = (ScrollView) findViewById(R.id.widget161);
		widget162 = (LinearLayout) findViewById(R.id.widget162);
		widget163 = (TextView) findViewById(R.id.widget163);
		widget164 = (TextView) findViewById(R.id.widget164);
		widget165 = (TextView) findViewById(R.id.widget165);
		widget166 = (TextView) findViewById(R.id.widget166);
		widget167 = (TextView) findViewById(R.id.widget167);
		widget168 = (TextView) findViewById(R.id.widget168);
		widget169 = (TextView) findViewById(R.id.widget169);
		widget170 = (TextView) findViewById(R.id.widget170);
		widget171 = (TextView) findViewById(R.id.widget171);
		widget172 = (TextView) findViewById(R.id.widget172);
		widget173 = (TextView) findViewById(R.id.widget173);
		widget174 = (TextView) findViewById(R.id.widget174);
		widget175 = (TextView) findViewById(R.id.widget175);
		
	}
	
}
