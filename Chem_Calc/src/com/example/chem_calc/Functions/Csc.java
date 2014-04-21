package com.example.chem_calc.Functions;

public class Csc extends Function{

	@Override
	public String FunctionName() {
		return "csc";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(1.0/Math.sin(Double.parseDouble(values[0])));
	}

}