package com.example.chem_calc.Functions;

public class Sin extends Function{

	@Override
	public String FunctionName() {
		return "sin";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.sin(Double.parseDouble(values[0])));
	}

}
