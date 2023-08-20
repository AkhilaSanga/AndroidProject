package com.example.foodrecipe;

import android.content.Intent;
import andoird.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridLayout extends MainActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridlayout);
	}
	public void openUrl(String url){
		Uri uri = new uri.parse(url);
		Intent launchWeb = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(launchWeb);
	}
	public void IdliDosa(View view){
		openUrl("https://www.idfreshfood.com/recipes/idli-dosa-recipe-batter/");
	}
	public void Bhendi(View view){
		openUrl("https://www.vegrecipesofindia.com/bharli-bhendi-recipe/");
	}
	public void Paneer(View view){
		openUrl("https://www.indianhealthyrecipes.com/?s=paneer+bhaji");
	}
	public void Pulav(View view){
		openUrl("https://www.indianhealthyrecipes.com/tawa-pulao/");
	}
	public void PuriBhaji(View view){
		openUrl("https://www.vegrecipesofindia.com/poori-bhaji/");
	}
	public void Pulihora(View view){
		openUrl("https://www.indianhealthyrecipes.com/pulihora-recipe-andhra-pulihora/");
	}
}