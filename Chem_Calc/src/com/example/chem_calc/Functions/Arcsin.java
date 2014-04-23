package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Arcsin extends Function{

	@Override
	public String FunctionName() {
		return "arcsin";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(Math.asin(values[0].GetValueAsDouble()));
	}

}