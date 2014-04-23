package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Csc extends Function{

	@Override
	public String FunctionName() {
		return "csc";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(1.0/Math.sin(values[0].GetValueAsDouble()));
	}

}