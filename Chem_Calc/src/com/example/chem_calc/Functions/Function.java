package com.example.chem_calc.Functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.chem_calc.Value;

public abstract class Function {

	public static Function GetFunction(String func)
	{
		return null;
	}
	
	
	public static List<Function> GetAllFunctions()
	{
		List<Function> lfunction = new ArrayList<Function>();
		lfunction.add(new Arccos());
		lfunction.add(new Arcsin());
		lfunction.add(new Arctan());
		lfunction.add(new Cos());
		lfunction.add(new Cot());
		lfunction.add(new Csc());
		lfunction.add(new Sec());
		lfunction.add(new Sin());
		lfunction.add(new Tan());
		lfunction.add(new e());
		lfunction.add(new Log());
		lfunction.add(new NaturalLog());
		
		return lfunction;
		
	}
	
	public String FunctionName()
	{
		return null;
	
	}
	public Value ProcessFunction(Value[] values)
	{
		return null;
		
	}
}
