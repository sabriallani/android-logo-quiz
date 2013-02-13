package com.example.logoquiz;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class GridViewAdapter extends ArrayAdapter<Logo> {

	Context context;
	int resource;
	List<Logo> data;
	int imageHieght;
	
	public GridViewAdapter(Context context, int resource,List<Logo> data,int imageHieght) {
		super(context, resource, data);
		this.context = context;
		this.resource = resource;
		this.data = data;
		this.imageHieght = imageHieght;
		//Log.v("Andy", "Constructor called");
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		final Holder holder;
		if(convertView == null){
			//Log.v("Andy", "Getting in get view");
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			//Log.v("Andy", "Got Inflater");
			convertView = inflater.inflate(resource, parent, false);
			//Log.v("Andy", "View Inflated");
			holder = new Holder();
			holder.img = (ImageView) convertView.findViewById(R.id.logoImage);
			holder.logoName = (TextView) ((Activity)context).findViewById(R.id.logoName);
			holder.img.getLayoutParams().height = imageHieght;
			
			//Log.v("Andy", "Got Reference of imgaeview");
			convertView.setTag(holder);
			//convertView.getLayoutParams().
		}else{
			holder = (Holder) convertView.getTag();
		}
		
		
		holder.logo = data.get(position);
		holder.img.setImageResource(holder.logo.getLogoResId());

		
		//to clear selection color of previous question
		convertView.setBackgroundColor(Color.TRANSPARENT);
		
		//Log.v("Andy", "Set the image");
		
		return convertView;
	}
	
	
	public static class Holder{
		ImageView img;
		Logo logo;
		TextView logoName;
	}

}
