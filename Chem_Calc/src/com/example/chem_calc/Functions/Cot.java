package com.example.chem_calc.Functions;

public class Cot extends Function{

	@Override
	public String FunctionName() {
		return "cot";
	}

	@Override
	public String ProcessFunction(String[] values) {
		return Double.toString(1.0/Math.tan(Double.parseDouble(values[0])));
	}

}