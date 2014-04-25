package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class e extends Function{

	@Override
	public String FunctionName() {
		return "e";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.pow(Math.E, values[0].GetValueAsDouble()));
	}

}