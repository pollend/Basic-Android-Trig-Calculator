// Generated from C:\Users\Michael pollind\Desktop\chem_calc\antlr\Calculator.g4 by ANTLR 4.1
package com.example.chem_calc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MUL=2, ADD=3, DIV=4, MIN=5, LPAR=6, RPAR=7, POWER=8, WS=9, DOUBLE=10, 
		CHEMICAL=11, NAME=12;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'*'", "'+'", "'/'", "'-'", "'('", "')'", "'^'", "WS", 
		"DOUBLE", "CHEMICAL", "NAME"
	};
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_paren = 2, RULE_function = 3;
	public static final String[] ruleNames = {
		"prog", "expr", "paren", "function"
	};

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << DOUBLE) | (1L << NAME))) != 0)) {
				{
				{
				setState(8); expr(0);
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class DOUBLEContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public DOUBLEContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterDOUBLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitDOUBLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDOUBLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MixedfunctionParenContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ParenContext paren() {
			return getRuleContext(ParenContext.class,0);
		}
		public MixedfunctionParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMixedfunctionParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMixedfunctionParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMixedfunctionParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public TerminalNode POWER() { return getToken(CalculatorParser.POWER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(CalculatorParser.MIN, 0); }
		public TerminalNode ADD() { return getToken(CalculatorParser.ADD, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends ExprContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public List<ParenContext> paren() {
			return getRuleContexts(ParenContext.class);
		}
		public ParenContext paren(int i) {
			return getRuleContext(ParenContext.class,i);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public TerminalNode MUL() { return getToken(CalculatorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new DOUBLEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15); match(DOUBLE);
				}
				break;

			case 2:
				{
				_localctx = new MixedfunctionParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16); paren();
				setState(17); function();
				}
				break;

			case 3:
				{
				_localctx = new MixedfunctionParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19); function();
				setState(20); paren();
				}
				break;

			case 4:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(22); function();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(25); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(27); paren();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(30); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(35);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(36); expr(9);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(38);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MIN) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(39); expr(8);
						}
						break;

					case 3:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(41); match(POWER);
						setState(42); expr(7);
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParenContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOUBLE(int i) {
			return getToken(CalculatorParser.DOUBLE, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CalculatorParser.DOUBLE); }
		public ParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenContext paren() throws RecognitionException {
		ParenContext _localctx = new ParenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paren);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(DOUBLE);
				setState(49); match(LPAR);
				setState(50); expr(0);
				setState(51); match(RPAR);
				setState(52); match(DOUBLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(DOUBLE);
				setState(55); match(LPAR);
				setState(56); expr(0);
				setState(57); match(RPAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(LPAR);
				setState(60); expr(0);
				setState(61); match(RPAR);
				setState(62); match(DOUBLE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(LPAR);
				setState(65); expr(0);
				setState(66); match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Token func;
		public TerminalNode RPAR() { return getToken(CalculatorParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(CalculatorParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode DOUBLE(int i) {
			return getToken(CalculatorParser.DOUBLE, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NAME() { return getToken(CalculatorParser.NAME, 0); }
		public List<TerminalNode> DOUBLE() { return getTokens(CalculatorParser.DOUBLE); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			int _alt;
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(DOUBLE);
				setState(71); ((FunctionContext)_localctx).func = match(NAME);
				setState(72); match(LPAR);
				{
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(73); expr(0);
						setState(74); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(80); expr(0);
				}
				setState(82); match(RPAR);
				setState(83); match(DOUBLE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(DOUBLE);
				setState(86); ((FunctionContext)_localctx).func = match(NAME);
				setState(87); match(LPAR);
				setState(88); expr(0);
				setState(89); match(RPAR);
				setState(90); match(DOUBLE);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(DOUBLE);
				setState(93); ((FunctionContext)_localctx).func = match(NAME);
				setState(94); match(LPAR);
				{
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95); expr(0);
						setState(96); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(102); expr(0);
				}
				setState(104); match(RPAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); match(DOUBLE);
				setState(107); ((FunctionContext)_localctx).func = match(NAME);
				setState(108); match(LPAR);
				setState(109); expr(0);
				setState(110); match(RPAR);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112); ((FunctionContext)_localctx).func = match(NAME);
				setState(113); match(LPAR);
				{
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114); expr(0);
						setState(115); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(119); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(121); expr(0);
				}
				setState(123); match(RPAR);
				setState(124); match(DOUBLE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); ((FunctionContext)_localctx).func = match(NAME);
				setState(127); match(LPAR);
				setState(128); expr(0);
				setState(129); match(RPAR);
				setState(130); match(DOUBLE);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(132); ((FunctionContext)_localctx).func = match(NAME);
				setState(133); match(LPAR);
				{
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(134); expr(0);
						setState(135); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(141); expr(0);
				}
				setState(143); match(RPAR);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145); ((FunctionContext)_localctx).func = match(NAME);
				setState(146); match(LPAR);
				setState(147); expr(0);
				setState(148); match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 8 >= _localctx._p;

		case 1: return 7 >= _localctx._p;

		case 2: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\16\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\6\3\37\n\3\r\3\16\3"+
		" \5\3#\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16\5P\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5"+
		"e\n\5\r\5\16\5f\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5x\n\5\r\5\16\5y\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0099\n\5\3\5\2\6\2\4\6\b\2\4\4\2\4\4\6\6\4\2\5\5"+
		"\7\7\u00ae\2\r\3\2\2\2\4\"\3\2\2\2\6F\3\2\2\2\b\u0098\3\2\2\2\n\f\5\4"+
		"\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2"+
		"\17\r\3\2\2\2\20\21\b\3\1\2\21#\7\f\2\2\22\23\5\6\4\2\23\24\5\b\5\2\24"+
		"#\3\2\2\2\25\26\5\b\5\2\26\27\5\6\4\2\27#\3\2\2\2\30\32\5\b\5\2\31\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34#\3\2\2\2\35\37\5"+
		"\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"\20"+
		"\3\2\2\2\"\22\3\2\2\2\"\25\3\2\2\2\"\31\3\2\2\2\"\36\3\2\2\2#/\3\2\2\2"+
		"$%\6\3\2\3%&\t\2\2\2&.\5\4\3\2\'(\6\3\3\3()\t\3\2\2).\5\4\3\2*+\6\3\4"+
		"\3+,\7\n\2\2,.\5\4\3\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\61\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\63\7\f\2\2\63\64\7\b\2"+
		"\2\64\65\5\4\3\2\65\66\7\t\2\2\66\67\7\f\2\2\67G\3\2\2\289\7\f\2\29:\7"+
		"\b\2\2:;\5\4\3\2;<\7\t\2\2<G\3\2\2\2=>\7\b\2\2>?\5\4\3\2?@\7\t\2\2@A\7"+
		"\f\2\2AG\3\2\2\2BC\7\b\2\2CD\5\4\3\2DE\7\t\2\2EG\3\2\2\2F\62\3\2\2\2F"+
		"8\3\2\2\2F=\3\2\2\2FB\3\2\2\2G\7\3\2\2\2HI\7\f\2\2IJ\7\16\2\2JN\7\b\2"+
		"\2KL\5\4\3\2LM\7\3\2\2MO\3\2\2\2NK\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2"+
		"\2QR\3\2\2\2RS\5\4\3\2ST\3\2\2\2TU\7\t\2\2UV\7\f\2\2V\u0099\3\2\2\2WX"+
		"\7\f\2\2XY\7\16\2\2YZ\7\b\2\2Z[\5\4\3\2[\\\7\t\2\2\\]\7\f\2\2]\u0099\3"+
		"\2\2\2^_\7\f\2\2_`\7\16\2\2`d\7\b\2\2ab\5\4\3\2bc\7\3\2\2ce\3\2\2\2da"+
		"\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\5\4\3\2ij\3\2\2\2j"+
		"k\7\t\2\2k\u0099\3\2\2\2lm\7\f\2\2mn\7\16\2\2no\7\b\2\2op\5\4\3\2pq\7"+
		"\t\2\2q\u0099\3\2\2\2rs\7\16\2\2sw\7\b\2\2tu\5\4\3\2uv\7\3\2\2vx\3\2\2"+
		"\2wt\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5\4\3\2|}\3\2\2"+
		"\2}~\7\t\2\2~\177\7\f\2\2\177\u0099\3\2\2\2\u0080\u0081\7\16\2\2\u0081"+
		"\u0082\7\b\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\t\2\2\u0084\u0085\7\f"+
		"\2\2\u0085\u0099\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u008b\7\b\2\2\u0088"+
		"\u0089\5\4\3\2\u0089\u008a\7\3\2\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\3\2\2\2\u0091\u0092\7\t"+
		"\2\2\u0092\u0099\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\b\2\2\u0095"+
		"\u0096\5\4\3\2\u0096\u0097\7\t\2\2\u0097\u0099\3\2\2\2\u0098H\3\2\2\2"+
		"\u0098W\3\2\2\2\u0098^\3\2\2\2\u0098l\3\2\2\2\u0098r\3\2\2\2\u0098\u0080"+
		"\3\2\2\2\u0098\u0086\3\2\2\2\u0098\u0093\3\2\2\2\u0099\t\3\2\2\2\16\r"+
		"\33 \"-/FPfy\u008d\u0098";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}