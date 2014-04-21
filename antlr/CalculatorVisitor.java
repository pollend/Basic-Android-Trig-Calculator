// Generated from C:\Users\Michael pollind\Desktop\chem_calc\antlr\Calculator.g4 by ANTLR 4.1
package com.example.chem_calc.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#DOUBLE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull CalculatorParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull CalculatorParser.PowerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#AddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull CalculatorParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull CalculatorParser.ParenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull CalculatorParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull CalculatorParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull CalculatorParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#MulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
}