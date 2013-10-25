package com.example.aci810_control2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {



	public final static String NAME_VALUE = "com.example.savingdata.NAME_VALUE";
	public final static String EMAIL_VALUE = "com.example.savingdata.EMAIL_VALUE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
	public void subForm(View view){
		Intent intent =  new Intent(this, Activity1.class);
		EditText nameEditText = (EditText)findViewById(R.id.editText1);
		EditText emailEditText = (EditText)findViewById(R.id.editText2);
		String name = nameEditText.getText().toString();
		String email = emailEditText.getText().toString();
		intent.putExtra(NAME_VALUE, name);
		intent.putExtra(EMAIL_VALUE, email);
		startActivity(intent);		
	}
	



}
