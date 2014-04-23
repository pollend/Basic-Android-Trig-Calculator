package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Cos extends Function{

	@Override
	public String FunctionName() {
		return "cos";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.cos(values[0].GetValueAsDouble()));
	}

}
