package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Tan extends Function{

	@Override
	public String FunctionName() {
		return "tan";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.tan(values[0].GetValueAsDouble()));
	}

}