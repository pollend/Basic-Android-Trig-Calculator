package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class NaturalLog extends Function{

	@Override
	public String FunctionName() {
		return "ln";
	}

	@Override
	public Value ProcessFunction(Value[] values) 
	{
		return new Value(Math.log(values[0].GetValueAsDouble()));
	}

}