package com.bluemner.WinterzauberApp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;


public class WinterzauberMain extends WinterzauberSplash implements OnClickListener, android.view.View.OnClickListener{
	

	 
	Button widget77;
	Button widget78;
	Button widget80;
	Button widget82;
	Button widget83;
	
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initUIElements();     
	}
	
	
	
	

	private void initUIElements() {
		
		RelativeLayout widget109 = (RelativeLayout) findViewById(R.id.widget109);
		TableLayout widget76 = (TableLayout) findViewById(R.id.widget76);
		widget77 = (Button) findViewById(R.id.widget77);
		widget77.setOnClickListener(this);	
		widget78 = (Button) findViewById(R.id.widget78);
		widget78.setOnClickListener(this);
		widget80 = (Button) findViewById(R.id.widget80);
		widget80.setOnClickListener(this);
		widget82 = (Button) findViewById(R.id.widget82);
		widget82.setOnClickListener(this);
		widget83 = (Button) findViewById(R.id.widget83);
		widget83.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.widget77:
			startActivity(new Intent(WinterzauberMain.this,
			WinterzauberInfo.class));
			break;
		case R.id.widget78:
			startActivity(new Intent(WinterzauberMain.this,
			WinterzauberProgramm.class));
			break;
		case R.id.widget80:
			startActivity(new Intent(WinterzauberMain.this,
			WinterzauberGallery.class));
			break;
		case R.id.widget82:
			Intent i = new Intent(Intent.ACTION_VIEW, 
				       Uri.parse("http://www.winterzauber-jungfernstieg.de/"));
				startActivity(i);
			break;
		case R.id.widget83:
			Uri uri = Uri.parse("google.navigation:q=Jungfernstieg+Hamburg");
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
			break;
		}
	}

	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	
	
}