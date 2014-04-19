package com.example.chem_calc;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;




import com.example.chem_calc.antlr.CalculatorBaseVisitor;
import com.example.chem_calc.antlr.CalculatorParser;



public class ParseTree extends CalculatorBaseVisitor<String>{

	@Override 
	public String visitDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx) 
	{
		return ctx.DOUBLE().getText();
	}

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

}
