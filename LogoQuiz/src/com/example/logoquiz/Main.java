package com.example.logoquiz;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Main extends Activity {

	private ArrayList<Logo> logoMasterList;
	private ArrayList<Integer> randomNumberUsed;
	private ArrayList<Logo> logoListToDisp;
	private TextView logoName;
	private TextView queCount;
	private GridView gv;
	private int optionSize = 16;
	private int gvColumSize = 4;
	private ArrayAdapter<Logo> adapter;
	private ArrayList<Integer> questionsAnswersSoFar;
	private int attemptToGetFreshQue = 5;

	
	private Logo getRandomQue(){
		int rand;
		rand = (int)(Math.random() * (logoMasterList.size() - 1));
		
		//try three times to check if question was already answered or not, else proceed with repeated que
		for(int i=0; i<attemptToGetFreshQue ;i++){
			if(!(questionsAnswersSoFar.contains(rand))){
				questionsAnswersSoFar.add(rand);
				break;
			}
			rand = (int)(Math.random() * (logoMasterList.size() - 1));
		}
		
		Logo randomLogo = logoMasterList.get(rand);
		randomNumberUsed.add(rand);
		return randomLogo;
	}
	
	private void getRemaingOptions(){

		int optionCount = 1;
		int rand;
		
		while(optionCount != optionSize){
			rand = (int)(Math.random() * (logoMasterList.size() - 1));
			if(randomNumberUsed.contains(rand)){
				//do nothing
			}else{
				randomNumberUsed.add(rand);
				logoListToDisp.add(logoMasterList.get(rand));
				optionCount = optionCount + 1;
			}
		}
		
	}
	
	
	public void addAnswerDisplayList(Logo que){
		//get a random position
		int randomPosition = (int)(Math.random() * ((logoListToDisp.size()) - 0));
		Log.v(LogoQuizApp.DEBUG_TAG, "random position:" + randomPosition + " out of: " + logoListToDisp.size());
		
		//swap answer with random position
		Logo tempLogo = logoListToDisp.get(randomPosition);
		logoListToDisp.set(randomPosition, que);
		logoListToDisp.add(tempLogo);
	}
	
	public void setupQue(){

		logoListToDisp.clear();
		randomNumberUsed.clear();
		
		//get random Question from Master List
		Logo que = getRandomQue();
		logoName.setText(que.getLogoName());
		queCount.setText("" + (questionsAnswersSoFar.size() - 1));

		//get random options
		getRemaingOptions();
		
		//add the answer in list of options
		addAnswerDisplayList(que);
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		logoName = (TextView) findViewById(R.id.logoName);
		queCount = (TextView) findViewById(R.id.count);
		gv = (GridView) findViewById(R.id.gridView1);

		gv.setNumColumns(gvColumSize);
		
		logoMasterList = ((LogoQuizApp)getApplication()).logoMasterList;

		//To ensure that same option is not repeated, save the generated random number in a list 
		randomNumberUsed= new ArrayList<Integer>();
		
		//create a separate list to maintain list of Logos to display in grid view
		logoListToDisp = new ArrayList<Logo>();
		
		//keep a track of which questions are already answerd
		questionsAnswersSoFar = new ArrayList<Integer>();
		
		setupQue();

		
		DisplayMetrics metrics = new DisplayMetrics();
		this.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		int screenHeight = metrics.heightPixels;
		int imageHieght = (screenHeight - 60); //remove space for androidbar, appbar and logoname textview
		imageHieght = (int)(imageHieght / 4); //as 4 rows will be displayed
		imageHieght = imageHieght - 10; //removing additional padding space

		Log.v(LogoQuizApp.DEBUG_TAG, "hiegth:" + metrics.heightPixels);
		Log.v(LogoQuizApp.DEBUG_TAG, "image:" + imageHieght);

		
		adapter = new GridViewAdapter(this,R.layout.cel_content, logoListToDisp ,imageHieght );
		gv.setAdapter(adapter);
		
		
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//Toast.makeText(Main.this, "" + position + " : " + id , Toast.LENGTH_SHORT).show();
				Logo logoSelected = ((GridViewAdapter.Holder)view.getTag()).logo;
				if(logoSelected.getLogoName().equals(logoName.getText().toString())){
					view.setBackgroundColor(Color.GREEN);
					setupQue();
					adapter.notifyDataSetChanged();

				}else{
					view.setBackgroundColor(Color.RED);
				}
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		questionsAnswersSoFar.clear();
		Log.v("Test", "Activity on destry called");
	}

}
