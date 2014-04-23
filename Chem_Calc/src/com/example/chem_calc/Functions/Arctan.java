package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Arctan extends Function{

	@Override
	public String FunctionName() {
		return "arctan";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.atan(values[0].GetValueAsDouble()));
	}

}