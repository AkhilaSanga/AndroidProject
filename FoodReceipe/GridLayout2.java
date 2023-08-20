package com.example.foodrecipe;

import android.content.Intent;
import andoird.app.compat.AppcompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridLayout2 extends MainActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridlayout2);
	}
	public void openUrl(String url){
		Uri uri = new uri.parse(url);
		Intent launchWeb = new Intent(Intent.ACTION_VIEW);
		startActivity(launchWeb);
	}
	public void fried_chicken(View view){
		openUrl("https://www.allrecipes.com/recipe/8805/crispy-fried-chicken/");
	}
	public void biryani(View view){
		openUrl("https://www.indianhealthyrecipes.com/mutton-biryani/");
	}
	public void chicken_lolipop(View view){
		openUrl("https://www.licious.in/blog/recipe/chicken-lollipops");
	}
	public void mutton_curry(View view){
		openUrl("https://www.licious.in/blog/recipe/mutton-curry-recipe");
	}
	public void mutton_keema(View view){
		openUrl("https://www.indianhealthyrecipes.com/keema-recipe-mutton-keema-curry/");
	}
	public void fish(View view){
		openUrl("https://www.indianhealthyrecipes.com/fish-fry-recipe/");
	}
}