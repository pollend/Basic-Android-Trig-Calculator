package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Sec extends Function{

	@Override
	public String FunctionName() {
		return "sec";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(1.0/Math.cos(values[0].GetValueAsDouble()));
	}

}