package com.example.chem_calc.Functions;

import com.example.chem_calc.Value;

public class Log extends Function{

	@Override
	public String FunctionName() {
		return "log";
	}

	@Override
	public Value ProcessFunction(Value[] values) 
	{
		if(values.length == 1)
			return new Value(Math.log10(values[0].GetValueAsDouble()));
		else
			return new Value(Math.log(values[1].GetValueAsDouble())/Math.log(values[0].GetValueAsDouble()));
	}

}