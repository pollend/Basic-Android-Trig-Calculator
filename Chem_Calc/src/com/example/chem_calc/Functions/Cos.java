package com.example.chem_calc.Functions;

public class Cos extends Function{

	@Override
	public String FunctionName() {
		return "cos";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.cos(Double.parseDouble(values[0])));
	}

}
