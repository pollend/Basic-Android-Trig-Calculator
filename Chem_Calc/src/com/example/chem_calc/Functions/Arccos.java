package com.example.chem_calc.Functions;

public class Arccos extends Function{

	@Override
	public String FunctionName() {
		return "arccos";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.acos(Double.parseDouble(values[0])));
	}

}