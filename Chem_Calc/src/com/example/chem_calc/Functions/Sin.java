package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Sin extends Function{

	@Override
	public String FunctionName() {
		return "sin";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.sin(values[0].GetValueAsDouble()));
	}

}
