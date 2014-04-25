package com.example.chem_calc;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.drm.DrmStore.Action;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class KeyboardActionListner implements OnKeyboardActionListener {

	private Activity mTargetActivity;

	private static int TRIG = -2;
	private static int CLIPBOARD = -100;
	private static int LN = -70;
	private static int e = -150;
	private static int ENTER = -1;
	private static int DELETE = -5;
	private static int LOG = -800;

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
		final EditText leditText = (EditText)lcurrentFocus;
		final Editable ltext = leditText.getText();
		final int lstart = leditText.getSelectionStart();
		

		
		if(primaryCode == ENTER)
		{
			leditText.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));
		}
		else if(primaryCode == DELETE)
		{
			if(lstart>0)
			ltext.delete(lstart-1,lstart);
		}
		else if(primaryCode == CLIPBOARD)
		{
			ClipboardManager lcipboard = (ClipboardManager)this.mTargetActivity.getApplicationContext().getSystemService(this.mTargetActivity.getApplicationContext().CLIPBOARD_SERVICE);
	
			ltext.insert(lstart,lcipboard.getPrimaryClip().getItemAt(0).getText());
		}
		else if(primaryCode == LN)
		{
			ltext.insert(lstart,"ln()");
			leditText.setSelection(lstart + "ln()".length() - 1 );
		}
		else if(primaryCode == LOG)
		{
			ltext.insert(lstart,"log()");
			leditText.setSelection(lstart + "log()".length() - 1 );
		}
		else if(primaryCode == e)
		{
			ltext.insert(lstart,"e()");
			leditText.setSelection(lstart + "e()".length() - 1 );
		}
		else if(primaryCode == TRIG)
		{
			
			String[] lstr = {"cos","sin","tan","cot","csc","sec","arccos","arcsin","arctan"};
			
			AlertDialog.Builder lbuilder = new AlertDialog.Builder(this.mTargetActivity).setTitle("Trig").setItems(lstr, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					
					String ltoadd = "";
					switch(which)
					{
						case 0:
							ltoadd = "cos()";
							break;
						case 1:
							ltoadd = "sin()";
							break;
						case 2:
							ltoadd = "tan()";
							break;
						case 3:
							ltoadd = "cot()";
							break;
						case 4:
							ltoadd = "csc()";					
							break;
						case 5:
							ltoadd = "sec()";	
							break;
						case 6:
							ltoadd = "arccos()";	
							break;
						case 7:
							ltoadd = "arcsin()";	
							break;
						case 8:
							ltoadd = "arctan()";	
						break;
					}
					ltext.insert(lstart,ltoadd);
					leditText.setSelection(lstart + ltoadd.length() - 1 );
			
				}
		           
			});
			
			lbuilder.create();
			lbuilder.show();
		}
		else
		{
			ltext.insert(lstart, Character.toString((char) primaryCode));
		}
		
	}
}