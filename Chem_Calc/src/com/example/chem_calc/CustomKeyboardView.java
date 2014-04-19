package com.example.chem_calc;


import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.view.inputmethod.InputMethodManager;

public class CustomKeyboardView extends KeyboardView {

	public CustomKeyboardView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void ShowkeyBoard(View v)
	{
		if (this.getVisibility() == this.GONE) {
			this.setVisibility(this.VISIBLE);
			Animation animation = AnimationUtils.loadAnimation(this.getContext(),R.layout.slide_in_bottom);
			this.showWithAnimation(animation);
			
		}
		if(v!= null)((InputMethodManager)this.getContext().getSystemService(this.getContext().INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(v.getWindowToken(), 0);
		
	}
	public void Hidekeyboard(View v)
	{
		if (this.getVisibility() != this.GONE) {
			this.setVisibility(this.GONE);
		}
	}
	
	public void showWithAnimation(Animation animation) {
		animation.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				setVisibility(View.VISIBLE);
			}
		});
		
		setAnimation(animation);
	}
}
