package com.windeor.android.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EfoodActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onRestroClick(View v){
    	//Intent intent = new Intent(EfoodActivity.this, SearchActivity.class);
    	//EfoodActivity.this.startActivity(intent);
    	
    	Intent i = new Intent(EfoodActivity.this,SearchActivity.class);
    	startActivity(i);

    }
}