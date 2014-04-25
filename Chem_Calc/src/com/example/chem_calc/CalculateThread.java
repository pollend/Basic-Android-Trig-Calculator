package com.example.chem_calc;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.example.chem_calc.antlr.CalculatorLexer;
import com.example.chem_calc.antlr.CalculatorParser;
import com.example.chem_calc.antlr.CalculatorParser.ProgContext;

import android.os.Handler;
import android.widget.TextView;

public class CalculateThread  extends Thread{

	private TextView _textView;
	private ParseTree _parseTree;
	private String _input;
	private Handler _handler = new Handler();
	
	public CalculateThread(TextView outputView,ParseTree parseTree,String input)
	{
		_textView = outputView;
		_parseTree = parseTree;
		_input = input;
	}
	public void run() {


		ANTLRInputStream linput = new ANTLRInputStream(_input);
		CalculatorLexer llexer = new CalculatorLexer(linput);
		CalculatorParser lparser = new CalculatorParser(new CommonTokenStream(llexer));
		final ProgContext ltree = lparser.prog();
		
		String loutput = "";
		try
		{
			loutput = _parseTree.visit(ltree).GetValueAsString();
		}
		catch(Exception e)
		{
			loutput = "Syntax Error";
		}
		
		final String lfinal = loutput;
		
		//handle setting text view on UI thread
		_handler.post(new Runnable(){
			@Override
			public void run() {
				_textView.setTextIsSelectable(true);
				_textView.setText(lfinal);
			}
		});

		
	  }
}
