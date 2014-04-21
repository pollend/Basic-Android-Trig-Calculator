package com.example.chem_calc.Functions;

import java.util.ArrayList;
import java.util.List;

public abstract class Function {
	public Function()
	{
		
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
		
		return lfunction;
		
	}
	
	public String FunctionName()
	{
		return null;
	
	}
	public String ProcessFunction(String[] values)
	{
		return null;
		
	}
}
