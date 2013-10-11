package com.bluemner.WinterzauberApp;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class WinterzauberGallery extends WinterzauberSplash{
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        
        Gallery gallery1 = (Gallery) findViewById(R.id.gallery1);
        gallery1.setAdapter(new ImageAdapter(this));
        
        gallery1.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView parent, View v, int position, long id) {
        		Toast.makeText(WinterzauberGallery.this, "" + position, Toast.LENGTH_SHORT).show();
        		
        	}
        });

	}
	
	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Context mContext;
		
		private Integer[] mImageIds = {
				R.drawable.europapassage,
				R.drawable.feuerwerk,
				R.drawable.jungfernstieg,
				R.drawable.parade,
				R.drawable.rathhaus,
				R.drawable.stern,
				R.drawable.weihnachtsparade1,
				R.drawable.weihnachtsparade2,
				R.drawable.alster1,
				R.drawable.zelte,
				R.drawable.kinderriesenrad,
				R.drawable.riesenradt,
				R.drawable.sterne1,
				R.drawable.winterzauber1,
		};
		
		public ImageAdapter(Context c){
			mContext = c;
			TypedArray attr = mContext.obtainStyledAttributes(R.styleable.WinterzauberGallery);
			mGalleryItemBackground = 
				attr.getResourceId(R.styleable.WinterzauberGallery_android_galleryItemBackground, 0);
			attr.recycle();
		}
		
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mImageIds.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		
		public View getView(int position, View convertView, ViewGroup parent){
			ImageView imageView = new ImageView(mContext);
			
			imageView.setImageResource(mImageIds[position]);
			imageView.setLayoutParams(new Gallery.LayoutParams(200, 150));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setBackgroundResource(mGalleryItemBackground);
			
			return imageView;
		}
		
	}
	
		}


	

