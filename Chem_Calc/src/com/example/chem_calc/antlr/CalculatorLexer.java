// Generated from C:\Users\Michael pollind\Desktop\chem_calc\antlr\Calculator.g4 by ANTLR 4.1
package com.example.chem_calc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MUL=2, ADD=3, DIV=4, MIN=5, LPAR=6, RPAR=7, POWER=8, WS=9, DOUBLE=10, 
		CHEMICAL=11, NAME=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'*'", "'+'", "'/'", "'-'", "'('", "')'", "'^'", "WS", "DOUBLE", 
		"CHEMICAL", "NAME"
	};
	public static final String[] ruleNames = {
		"T__0", "MUL", "ADD", "DIV", "MIN", "LPAR", "RPAR", "POWER", "WS", "DOUBLE", 
		"CHEMICAL", "NAME"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\6\n-\n\n\r\n\16\n.\3\n\3\n\3\13\6\13\64\n\13\r\13\16"+
		"\13\65\3\13\3\13\6\13:\n\13\r\13\16\13;\3\13\6\13?\n\13\r\13\16\13@\3"+
		"\13\3\13\6\13E\n\13\r\13\16\13F\5\13I\n\13\3\f\6\fL\n\f\r\f\16\fM\3\f"+
		"\6\fQ\n\f\r\f\16\fR\3\r\6\rV\n\r\r\r\16\rW\2\16\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\2\25\f\1\27\r\1\31\16\1\3\2\6\4\2"+
		"\13\13\"\"\3\2\62;\6\2\"\"C\\c|~~\4\2C\\c|b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2"+
		"\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17\'\3\2"+
		"\2\2\21)\3\2\2\2\23,\3\2\2\2\25H\3\2\2\2\27K\3\2\2\2\31U\3\2\2\2\33\34"+
		"\7.\2\2\34\4\3\2\2\2\35\36\7,\2\2\36\6\3\2\2\2\37 \7-\2\2 \b\3\2\2\2!"+
		"\"\7\61\2\2\"\n\3\2\2\2#$\7/\2\2$\f\3\2\2\2%&\7*\2\2&\16\3\2\2\2\'(\7"+
		"+\2\2(\20\3\2\2\2)*\7`\2\2*\22\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2."+
		",\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\b\n\2\2\61\24\3\2\2\2\62\64\t\3"+
		"\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\679\7\60\2\28:\t\3\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<I"+
		"\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AI\3\2\2\2B"+
		"D\7\60\2\2CE\t\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2"+
		"H\63\3\2\2\2H>\3\2\2\2HB\3\2\2\2I\26\3\2\2\2JL\t\4\2\2KJ\3\2\2\2LM\3\2"+
		"\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2S\30\3\2\2\2TV\t\5\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2X\32\3\2\2\2\f\2.\65;@FHMRW";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}