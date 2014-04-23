package com.example.chem_calc;

public class Value {

	private Object _value;
	private ParseTree _parseTree;
	
	public Value(String value)
	{
		_value = value;
		
	}
	public Value(double value)
	{
		_value = value;
	}
	
	public Value(Object object)
	{
		_value = object;
	}
	
	public Class<?> GetObjectClass()
	{
		return _value.getClass();
	}
	
	public String GetValueAsString()
	{
		if(_value.getClass() == String.class)
			return (String) _value;
		else if(_value.getClass() == Double.class)
			return	Double.toString((Double)_value); 
		else
		return "";
		
	}
	
	public double GetValueAsDouble()
	{
		if(_value.getClass() == Double.class)
			return  (Double) _value;
		else if(_value.getClass() == String.class)
			return Double.parseDouble((String)_value);
		else
			return 0;
	
	}
	
}
