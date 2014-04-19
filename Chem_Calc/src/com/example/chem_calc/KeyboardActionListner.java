package com.example.chem_calc;

import android.app.Activity;
import android.drm.DrmStore.Action;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class KeyboardActionListner implements OnKeyboardActionListener {

	private Activity mTargetActivity;

	
	public KeyboardActionListner(Activity targetActivity) {
		mTargetActivity = targetActivity;
	}

	@Override
	public void swipeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeRight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swipeDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onText(CharSequence text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRelease(int primaryCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPress(int primaryCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onKey(int primaryCode, int[] keyCodes) {

		View lcurrentFocus = this.mTargetActivity.getWindow().getCurrentFocus();
		if(lcurrentFocus == null || lcurrentFocus.getClass() != EditText.class)return;
		EditText leditText = (EditText)lcurrentFocus;
		Editable ltext = leditText.getText();
		int lstart = leditText.getSelectionStart();
		if(primaryCode == -1)
		{

			leditText.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));
		}
		else if(primaryCode == -5)
		{
			ltext.delete(lstart-1,lstart);
		}
		else
		ltext.insert(lstart, Character.toString((char) primaryCode));
		
	}
}