package com.example.chem_calc.Functions;

public class Sec extends Function{

	@Override
	public String FunctionName() {
		return "sec";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(1.0/Math.cos(Double.parseDouble(values[0])));
	}

}