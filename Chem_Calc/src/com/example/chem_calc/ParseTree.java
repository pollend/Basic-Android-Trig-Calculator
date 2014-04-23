package com.example.chem_calc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import com.example.chem_calc.Functions.Function;
import com.example.chem_calc.antlr.CalculatorBaseVisitor;
import com.example.chem_calc.antlr.CalculatorParser;
import com.example.chem_calc.Functions.*;



public class ParseTree extends CalculatorBaseVisitor<Value>{

	private Map<String, Function> _functions = new HashMap<String,Function>();

	public ParseTree()
	{
		List<Function> lfunctions = Function.GetAllFunctions();
		for(int x =0; x < lfunctions.size(); x++)
		{
			_functions.put(lfunctions.get(x).FunctionName(), lfunctions.get(x));
		}

	}

	@Override 
	public Value visitProg(@NotNull CalculatorParser.ProgContext ctx)
	{ 
		if(ctx.expr().size() > 1)
		{
			double lfinal = 1;
			for(int x = 0;x < ctx.expr().size();x++)
			{
				lfinal *= visit(ctx.expr().get(x)).GetValueAsDouble();
			}
			return new Value(lfinal);
		}
		else
		return super.visitProg(ctx); 
	}


	@Override 
	public Value visitDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx) 
	{
		return new Value(Double.parseDouble(ctx.DOUBLE().getText()));
	}
	
	@Override 
	public Value visitPower(@NotNull CalculatorParser.PowerContext ctx) 
	{ 
		double left = visit(ctx.expr(0)).GetValueAsDouble();
		double right = visit(ctx.expr(1)).GetValueAsDouble();
		return new Value(Math.pow(left, right));

	}

	
	@Override
	public Value visitAddSub(@NotNull CalculatorParser.AddSubContext ctx) 
	{ 
		double left = visit(ctx.expr(0)).GetValueAsDouble();
		double right = visit(ctx.expr(1)).GetValueAsDouble();
		if(ctx.op.getType() == CalculatorParser.ADD)
		{
			return new Value(left + right);
		}
		else
		{
			return new Value(left - right);
		}
	}


	@Override
	public Value visitMulDiv(@NotNull CalculatorParser.MulDivContext ctx)
	{ 
		double left = visit(ctx.expr(0)).GetValueAsDouble();
		double right = visit(ctx.expr(1)).GetValueAsDouble();
		if(ctx.op.getType() == CalculatorParser.MUL)
		{
			return new Value(left * right);
		}
		else
		{
			return new Value(left / right);
		}
	}
	
	@Override 
	public Value visitFunction(@NotNull CalculatorParser.FunctionContext ctx) 
	{ 
		
		Value[] lvalue = new Value[ctx.expr().size()];
		for(int x = 0;x < ctx.expr().size(); x++)
		{
			lvalue[x] = visit(ctx.expr(x));
		}
		
		double lfinal = 1;
		for(int x = 0;x < ctx.DOUBLE().size();x++)
		{
			lfinal  *= Double.parseDouble(ctx.DOUBLE(x).getText());
		}
		
		return new Value(_functions.get(ctx.func.getText()).ProcessFunction(lvalue).GetValueAsDouble() * lfinal);
		
	}
	
	@Override 
	public Value visitParens(@NotNull CalculatorParser.ParensContext ctx)
	{
		if(ctx.paren().size() > 1)
		{
			double lfinal = 1;
			for(int x = 0;x < ctx.paren().size();x++)
			{
				lfinal *= visit(ctx.paren(x)).GetValueAsDouble();
			}
			return new Value(lfinal);
		}
		else
		return super.visitParens(ctx);
	}
	@Override 
	public Value visitParen(@NotNull CalculatorParser.ParenContext ctx) 
	{ 
		double lfinal = 1;
		for(int x = 0;x < ctx.DOUBLE().size();x++)
		{
			lfinal  *= Double.parseDouble(ctx.DOUBLE(x).getText());
		}
		return new Value(visit(ctx.expr()).GetValueAsDouble()*lfinal);
	}
	
	@Override 
	public Value visitMixedfunctionParen(@NotNull CalculatorParser.MixedfunctionParenContext ctx)
	{ 
		double lfunction  =visit(ctx.function()).GetValueAsDouble();
		double lparen = visit(ctx.paren()).GetValueAsDouble();
		return new Value(lfunction * lparen);
	}


}
