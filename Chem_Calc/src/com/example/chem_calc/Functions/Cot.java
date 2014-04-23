package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Cot extends Function{

	@Override
	public String FunctionName() {
		return "cot";
	}

	@Override
	public Value ProcessFunction(Value[] values) {
		return new Value(1.0/Math.tan(values[0].GetValueAsDouble()));
	}

}