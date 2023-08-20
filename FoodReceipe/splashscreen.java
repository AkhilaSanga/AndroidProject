package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.foodrecipe.R;
public class splashscreen extends AppCompatActivity{
	Handler handler;

	@override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		handler=new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run(){
				startActivity(new Intent(splashscreen.this,MainActivity.class));
			}
		}, 2000);
	}
}