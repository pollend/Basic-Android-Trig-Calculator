package com.example.chem_calc.Functions;

public class Arcsin extends Function{

	@Override
	public String FunctionName() {
		return "arcsin";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(Math.asin(Double.parseDouble(values[0])));
	}

}