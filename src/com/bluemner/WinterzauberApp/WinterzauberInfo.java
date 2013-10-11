package com.bluemner.WinterzauberApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class WinterzauberInfo extends Activity {

	
RelativeLayout widget64;
ScrollView widget72;
TextView widget79;
TextView widget80;
TextView widget81;
TextView widget82;
TextView widget83;
TextView widget84;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        initUIElements();
       
	}

	private void initUIElements() {
		widget64 = (RelativeLayout) findViewById(R.id.widget64);
		widget72 = (ScrollView) findViewById(R.id.widget72);
		widget79 = (TextView) findViewById(R.id.widget79);
		widget80 = (TextView) findViewById(R.id.widget80);
		widget81 = (TextView) findViewById(R.id.widget81);
		widget82 = (TextView) findViewById(R.id.widget82);
		widget83 = (TextView) findViewById(R.id.widget83);
		widget84 = (TextView) findViewById(R.id.widget84);
		
		
	}


}
