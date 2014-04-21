package com.example.chem_calc.Functions;

public class Arctan extends Function{

	@Override
	public String FunctionName() {
		return "arctan";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.atan(Double.parseDouble(values[0])));
	}

}