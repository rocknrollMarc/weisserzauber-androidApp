package com.bluemner.WinterzauberApp;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class WinterzauberSplash extends Activity {
    /** Called when the activity is first created. */
    
	public ImageView IvSplash;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        IvSplash = (ImageView) findViewById (R.id.IvSplash);
        final Animation splash_anim = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        splash_anim.setAnimationListener(new AnimationListener(){

			@Override
			public void onAnimationEnd(Animation arg0) {
				startActivity(new Intent(WinterzauberSplash.this,
										WinterzauberMain.class));
				WinterzauberSplash.this.finish();
			
				
			}

			@Override
			public void onAnimationRepeat(Animation arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animation arg0) {
				// TODO Auto-generated method stub
				
			}
        });
        
        IvSplash.startAnimation(splash_anim);
        
        
    }
}