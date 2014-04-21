package com.example.chem_calc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import com.example.chem_calc.Functions.Function;
import com.example.chem_calc.antlr.CalculatorBaseVisitor;
import com.example.chem_calc.antlr.CalculatorParser;
import com.example.chem_calc.Functions.*;



public class ParseTree extends CalculatorBaseVisitor<String>{

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
	public String visitProg(@NotNull CalculatorParser.ProgContext ctx)
	{ 
		if(ctx.expr().size() > 1)
		{
			double lfinal = 1;
			for(int x = 0;x < ctx.expr().size();x++)
			{
				lfinal *= Double.parseDouble(visit(ctx.expr().get(x)));
			}
			return Double.toString(lfinal);
		}
		else
		return super.visitProg(ctx); 
	}


	@Override 
	public String visitDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx) 
	{
		
		return ctx.DOUBLE().getText();
	}
	/*@Override 
	public String visitMul(@NotNull CalculatorParser.MulContext ctx) 
	{ 
		double left = Double.parseDouble(visit(ctx.expr()));
		double right = Double.parseDouble(visit(ctx.function()));
		return Double.toString((left * right));
	}

	@Override 
	public String visitTriMulFun(@NotNull CalculatorParser.TriMulFunContext ctx) 
	{ 
		double left = Double.parseDouble(visit(ctx.expr(0)));
		double middle = Double.parseDouble(visit(ctx.function()));
		double right = Double.parseDouble(visit(ctx.expr(1)));
		return Double.toString((left * middle* right));
	}*/

	
	@Override 
	public String visitPower(@NotNull CalculatorParser.PowerContext ctx) 
	{ 
		double left = Double.parseDouble(visit(ctx.expr(0)));
		double right = Double.parseDouble(visit(ctx.expr(1)));
		return Double.toString(Math.pow(left, right));

	}

	
	@Override
	public String visitAddSub(@NotNull CalculatorParser.AddSubContext ctx) 
	{ 
		double left = Double.parseDouble(visit(ctx.expr(0)));
		double right = Double.parseDouble(visit(ctx.expr(1)));
		if(ctx.op.getType() == CalculatorParser.ADD)
		{
			return Double.toString(left + right);
		}
		else
		{
			return Double.toString(left - right);
		}
	}


	@Override
	public String visitMulDiv(@NotNull CalculatorParser.MulDivContext ctx)
	{ 
		double left = Double.parseDouble(visit(ctx.expr(0)));
		double right = Double.parseDouble(visit(ctx.expr(1)));
		if(ctx.op.getType() == CalculatorParser.MUL)
		{
			return Double.toString(left * right);
		}
		else
		{
			return Double.toString(left / right);
		}
	}
	
	@Override 
	public String visitFunction(@NotNull CalculatorParser.FunctionContext ctx) 
	{ 
		String[] lvalue = new String[ctx.expr().size()];
		for(int x = 0;x < ctx.expr().size(); x++)
		{
			lvalue[x] = visit(ctx.expr(x));
		}
		return _functions.get(ctx.func.getText()).ProcessFunction(lvalue);
		
	}
	
	@Override public String visitParens(@NotNull CalculatorParser.ParensContext ctx)
	{
		if(ctx.paren().size() > 1)
		{
			double lfinal = 1;
			for(int x = 0;x < ctx.paren().size();x++)
			{
				lfinal *= Double.parseDouble(visit(ctx.paren(x)));
			}
			return Double.toString(lfinal);
		}
		else
		return super.visitParens(ctx);
	}
	@Override 
	public String visitParen(@NotNull CalculatorParser.ParenContext ctx) 
	{ 
		return visit(ctx.expr());
		
	}



}
