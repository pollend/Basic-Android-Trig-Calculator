package com.example.chem_calc;


import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.ViewGroup;

public class MainActivity extends Activity {
	private BackListView _listView;
	private static int _id;
	
	private FragmentManager _fragmentManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		_fragmentManager = this.getFragmentManager();
		
		_listView = new BackListView();
		_listView.OnCreate(this);
		
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		_listView.UpdateKeyboard(newConfig.orientation );
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 @Override
	 public void onDestroy() {
		  super.onDestroy();
		
	 }
	public static int GenerateID()
	{
		_id++;
		return _id;
	
	}

}
