package com.example.chem_calc;


import org.antlr.v4.runtime.*;

import com.example.chem_calc.antlr.CalculatorLexer;
import com.example.chem_calc.antlr.CalculatorParser;
import com.example.chem_calc.antlr.CalculatorParser.ProgContext;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public class BackListView {
	private LinearLayout _scrollingView;
	private Activity _activity;
	private EditText _textView;
	private CustomKeyboardView _customKeyboard;
	private ParseTree _parseTree = new ParseTree();
	
	public void OnCreate(Activity activity)
	{
		_activity= activity;
		activity.setContentView(R.layout.list_view);
		_scrollingView = (LinearLayout)((ScrollView) activity.findViewById(R.id.FieldView)).getChildAt(0);
		
		//set the keyboard
		_customKeyboard = (CustomKeyboardView) activity.findViewById(R.id.keyboard_view);
		_customKeyboard.setKeyboard( new Keyboard(activity.getApplicationContext(), R.layout.basic_math_keyboard));
		_customKeyboard.setOnKeyboardActionListener(new KeyboardActionListner(_activity));
		
		AddField();
	}
	
	private void AddField()
	{
		
		final RelativeLayout lrelativeView = new RelativeLayout(_activity.getApplicationContext());
		final EditText lfield = new EditText(_activity.getApplicationContext());
		final View lseperator = new View(_activity.getApplicationContext());
		
		_textView = lfield;
		
		//set ID
		lrelativeView.setId(MainActivity.GenerateID());
		
		//add the components
		_scrollingView.addView(lrelativeView);
		lrelativeView.addView(lfield);
		lrelativeView.addView(lseperator);
		/*SEPERATOR*/
		{
			RelativeLayout.LayoutParams lprams = (RelativeLayout.LayoutParams)lseperator.getLayoutParams();
			lprams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
			lprams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			lprams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			lseperator.setBackgroundColor(Color.BLUE);
			lprams.setMargins(10, 10, 10, 10);
			lprams.height = 1;
		
		}
		
		/*FIELD*/
		{
			
			RelativeLayout.LayoutParams lprams = (RelativeLayout.LayoutParams)lfield.getLayoutParams();
			lprams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
			lprams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			lprams.setMargins(10, 10, 10, 10);
			lfield.setBackgroundColor(Color.TRANSPARENT);
			lfield.setTextColor(Color.BLACK);
			lfield.setTextIsSelectable(true);
			lfield.setInputType(InputType.TYPE_NULL);
			
			lfield.setOnTouchListener(new View.OnTouchListener() {
				
				@Override
				public boolean onTouch(View v, MotionEvent event) {
				    EditText edittext = (EditText) v;
			        edittext.setInputType(InputType.TYPE_NULL); // Disable standard keyboard
			        edittext.onTouchEvent(event);               // Call native handler
			        edittext.setInputType(InputType.TYPE_CLASS_TEXT);              // Restore input type
			        return true; // Consume touch event
				}
			});
				
			lfield.setOnFocusChangeListener(new View.OnFocusChangeListener() {
				@Override
				public void onFocusChange(View v, boolean hasFocus) {
					
					if(hasFocus)
						_customKeyboard.ShowkeyBoard( v,_activity);
					else
						_customKeyboard.Hidekeyboard( v,_activity);
				}
			});
			lfield.setOnKeyListener(new View.OnKeyListener() {
				
				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event) {
					// TODO Auto-generated method stub
					if(keyCode == KeyEvent.KEYCODE_ENTER)
					{
						ChangeToDisplay(lrelativeView);
						AddField();
					}
					return true;
				}
			});
			

		}

	}
	
	private void ChangeToDisplay(RelativeLayout layout)
	{
		layout.removeAllViews();
		final TextView lequation = new TextView(_activity.getApplicationContext());
		final TextView loutput = new TextView(_activity.getApplicationContext());
		final View lseperator = new View(_activity.getApplicationContext());
		
		layout.addView(loutput);
		layout.addView(lseperator);
		layout.addView(lequation);
		
		/*OUTPUT ANSWER*/
		{
			RelativeLayout.LayoutParams lprams = (RelativeLayout.LayoutParams)loutput.getLayoutParams();
			lprams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			lprams.setMargins(19, 10, 10, 19);
			loutput.setTextColor(Color.BLACK);
			loutput.setTextSize(20);
			loutput.setPadding(0, 0, 17,0);
			
			ANTLRInputStream linput = new ANTLRInputStream(_textView.getText().toString());
			CalculatorLexer llexer = new CalculatorLexer(linput);
			CalculatorParser lparser = new CalculatorParser(new CommonTokenStream(llexer));
			ProgContext ltree = lparser.prog();
			loutput.setTextIsSelectable(true);
			loutput.setText(_parseTree.visit(ltree));

		}
		
		/*EQUATION*/
		{
			RelativeLayout.LayoutParams lprams = (RelativeLayout.LayoutParams)lequation.getLayoutParams();
			lprams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
			lprams.setMargins(19, 10, 10, 19);
			lequation.setTextColor(Color.BLACK);
			lequation.setTextSize(20);
			lequation.setPadding(14, 0, 0, 0);
			lequation.setTextIsSelectable(true);
			lequation.setText(_textView.getText());
		}
		/*SEPERATOR*/
		{
			RelativeLayout.LayoutParams lprams = (RelativeLayout.LayoutParams)lseperator.getLayoutParams();
			lprams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
			lprams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			lprams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			lseperator.setBackgroundColor(Color.BLACK);
			lprams.setMargins(15, 10, 15, 10);
			lprams.height = 1;
		
		}
		
		
		
	}

	
}
