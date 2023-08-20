package com.example.foodrecipe;

import android.os.bundle;
import android.view.view;
import android.widget.Button;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{
	Button btn1, btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.b1);
		btn2 = (Button) findViewById(R.id.b2);
		
		btn1.setOnClickListener(new View.OnClickListener){
			@Override
			public void OnClick(View view){
				Intent intent = new Intent(getBaseContext(),GridLayout.class);
				startActivity(intent);
			}
		});
		btn2.setOnClickListener(new View.OnClickListener){
			@Override
			public void OnClick(View view){
				Intent intent = new Intent(getBaseContext(),GridLayout2.class);
				startActivity(intent);
			}
		});
	}
}
