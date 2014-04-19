package com.example.chem_calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private BackListView _listView;
	private static int _id;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		_listView = new BackListView();
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.list_view);
		_listView.OnCreate(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public static int GenerateID()
	{
		_id++;
		return _id;
	
	}

}
