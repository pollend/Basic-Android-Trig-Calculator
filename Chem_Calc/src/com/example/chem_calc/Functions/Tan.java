package com.example.chem_calc.Functions;

public class Tan extends Function{

	@Override
	public String FunctionName() {
		return "tan";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.tan(Double.parseDouble(values[0])));
	}

}