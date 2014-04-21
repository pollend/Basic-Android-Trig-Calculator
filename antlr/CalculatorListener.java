// Generated from C:\Users\Michael pollind\Desktop\chem_calc\antlr\Calculator.g4 by ANTLR 4.1
package com.example.chem_calc.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#DOUBLE}.
	 * @param ctx the parse tree
	 */
	void enterDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#DOUBLE}.
	 * @param ctx the parse tree
	 */
	void exitDOUBLE(@NotNull CalculatorParser.DOUBLEContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull CalculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull CalculatorParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull CalculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#Power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull CalculatorParser.PowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#mixedfunctionParen}.
	 * @param ctx the parse tree
	 */
	void enterMixedfunctionParen(@NotNull CalculatorParser.MixedfunctionParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#mixedfunctionParen}.
	 * @param ctx the parse tree
	 */
	void exitMixedfunctionParen(@NotNull CalculatorParser.MixedfunctionParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull CalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#AddSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull CalculatorParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull CalculatorParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull CalculatorParser.ParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull CalculatorParser.ParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CalculatorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CalculatorParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull CalculatorParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull CalculatorParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#MulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull CalculatorParser.MulDivContext ctx);
}