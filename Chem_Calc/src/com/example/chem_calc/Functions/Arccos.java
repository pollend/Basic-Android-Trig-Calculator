package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Arccos extends Function{

	@Override
	public String FunctionName() {
		return "arccos";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.acos(values[0].GetValueAsDouble()));
	}

}