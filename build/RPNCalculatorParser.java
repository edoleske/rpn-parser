// Generated from RPNCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RPNCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIN=1, COS=2, TAN=3, ADD=4, SUB=5, MUL=6, DIV=7, POW=8, EQUAL=9, LPAR=10, 
		RPAR=11, NL=12, WS=13, ID=14, INT=15, DOUBLE=16;
	public static final int
		RULE_input = 0, RULE_setVariable = 1, RULE_addOrSub = 2, RULE_mulOrDiv = 3, 
		RULE_pow = 4, RULE_trig = 5, RULE_atom = 6;
	public static final String[] ruleNames = {
		"input", "setVariable", "addOrSub", "mulOrDiv", "pow", "trig", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sin'", "'cos'", "'tan'", "'+'", "'-'", "'*'", "'/'", "'^'", "'='", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SIN", "COS", "TAN", "ADD", "SUB", "MUL", "DIV", "POW", "EQUAL", 
		"LPAR", "RPAR", "NL", "WS", "ID", "INT", "DOUBLE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RPNCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RPNCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToSetVariableContext extends InputContext {
		public SetVariableContext setVariable() {
			return getRuleContext(SetVariableContext.class,0);
		}
		public TerminalNode NL() { return getToken(RPNCalculatorParser.NL, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ToSetVariableContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitToSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateContext extends InputContext {
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RPNCalculatorParser.EOF, 0); }
		public TerminalNode NL() { return getToken(RPNCalculatorParser.NL, 0); }
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ToSetVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				setVariable();
				setState(15);
				match(NL);
				setState(16);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				addOrSub(0);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(19);
					match(NL);
					}
				}

				setState(22);
				match(EOF);
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

	public static class SetVariableContext extends ParserRuleContext {
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
	 
		public SetVariableContext() { }
		public void copyFrom(SetVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends SetVariableContext {
		public TerminalNode ID() { return getToken(RPNCalculatorParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RPNCalculatorParser.EQUAL, 0); }
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public AssignmentContext(SetVariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setVariable);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ID);
			setState(27);
			match(EQUAL);
			setState(28);
			addOrSub(0);
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

	public static class AddOrSubContext extends ParserRuleContext {
		public AddOrSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOrSub; }
	 
		public AddOrSubContext() { }
		public void copyFrom(AddOrSubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends AddOrSubContext {
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public TerminalNode ADD() { return getToken(RPNCalculatorParser.ADD, 0); }
		public List<MulOrDivContext> mulOrDiv() {
			return getRuleContexts(MulOrDivContext.class);
		}
		public MulOrDivContext mulOrDiv(int i) {
			return getRuleContext(MulOrDivContext.class,i);
		}
		public AdditionContext(AddOrSubContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends AddOrSubContext {
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public TerminalNode SUB() { return getToken(RPNCalculatorParser.SUB, 0); }
		public List<MulOrDivContext> mulOrDiv() {
			return getRuleContexts(MulOrDivContext.class);
		}
		public MulOrDivContext mulOrDiv(int i) {
			return getRuleContext(MulOrDivContext.class,i);
		}
		public SubtractionContext(AddOrSubContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToMulOrDivContext extends AddOrSubContext {
		public MulOrDivContext mulOrDiv() {
			return getRuleContext(MulOrDivContext.class,0);
		}
		public ToMulOrDivContext(AddOrSubContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitToMulOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOrSubContext addOrSub() throws RecognitionException {
		return addOrSub(0);
	}

	private AddOrSubContext addOrSub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddOrSubContext _localctx = new AddOrSubContext(_ctx, _parentState);
		AddOrSubContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_addOrSub, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMulOrDivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(31);
			mulOrDiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new AddOrSubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addOrSub);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(35); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(34);
							mulOrDiv(0);
							}
							}
							setState(37); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
						setState(39);
						match(ADD);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new AddOrSubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addOrSub);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(43); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(42);
							mulOrDiv(0);
							}
							}
							setState(45); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
						setState(47);
						match(SUB);
						}
						break;
					}
					} 
				}
				setState(53);
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

	public static class MulOrDivContext extends ParserRuleContext {
		public MulOrDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOrDiv; }
	 
		public MulOrDivContext() { }
		public void copyFrom(MulOrDivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends MulOrDivContext {
		public MulOrDivContext mulOrDiv() {
			return getRuleContext(MulOrDivContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RPNCalculatorParser.MUL, 0); }
		public List<PowContext> pow() {
			return getRuleContexts(PowContext.class);
		}
		public PowContext pow(int i) {
			return getRuleContext(PowContext.class,i);
		}
		public MultiplicationContext(MulOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MulOrDivContext {
		public MulOrDivContext mulOrDiv() {
			return getRuleContext(MulOrDivContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode DIV() { return getToken(RPNCalculatorParser.DIV, 0); }
		public DivisionContext(MulOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToPowContext extends MulOrDivContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public ToPowContext(MulOrDivContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitToPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOrDivContext mulOrDiv() throws RecognitionException {
		return mulOrDiv(0);
	}

	private MulOrDivContext mulOrDiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulOrDivContext _localctx = new MulOrDivContext(_ctx, _parentState);
		MulOrDivContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_mulOrDiv, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToPowContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(55);
			pow();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MulOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulOrDiv);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(58);
							pow();
							}
							}
							setState(61); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
						setState(63);
						match(MUL);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MulOrDivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mulOrDiv);
						setState(65);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(66);
						pow();
						setState(67);
						match(DIV);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PowContext extends ParserRuleContext {
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
	 
		public PowContext() { }
		public void copyFrom(PowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerContext extends PowContext {
		public TrigContext trig() {
			return getRuleContext(TrigContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode POW() { return getToken(RPNCalculatorParser.POW, 0); }
		public PowerContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pow);
		try {
			_localctx = new PowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			trig(0);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(75);
				pow();
				setState(76);
				match(POW);
				}
				break;
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

	public static class TrigContext extends ParserRuleContext {
		public TrigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trig; }
	 
		public TrigContext() { }
		public void copyFrom(TrigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToNegateContext extends TrigContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToNegateContext(TrigContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitToNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SineContext extends TrigContext {
		public TrigContext trig() {
			return getRuleContext(TrigContext.class,0);
		}
		public TerminalNode SIN() { return getToken(RPNCalculatorParser.SIN, 0); }
		public SineContext(TrigContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitSine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TangentContext extends TrigContext {
		public TrigContext trig() {
			return getRuleContext(TrigContext.class,0);
		}
		public TerminalNode TAN() { return getToken(RPNCalculatorParser.TAN, 0); }
		public TangentContext(TrigContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitTangent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosineContext extends TrigContext {
		public TrigContext trig() {
			return getRuleContext(TrigContext.class,0);
		}
		public TerminalNode COS() { return getToken(RPNCalculatorParser.COS, 0); }
		public CosineContext(TrigContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitCosine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrigContext trig() throws RecognitionException {
		return trig(0);
	}

	private TrigContext trig(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TrigContext _localctx = new TrigContext(_ctx, _parentState);
		TrigContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_trig, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToNegateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(81);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new SineContext(new TrigContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_trig);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(84);
						match(SIN);
						}
						break;
					case 2:
						{
						_localctx = new CosineContext(new TrigContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_trig);
						setState(85);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(86);
						match(COS);
						}
						break;
					case 3:
						{
						_localctx = new TangentContext(new TrigContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_trig);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(TAN);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends AtomContext {
		public TerminalNode LPAR() { return getToken(RPNCalculatorParser.LPAR, 0); }
		public AddOrSubContext addOrSub() {
			return getRuleContext(AddOrSubContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(RPNCalculatorParser.RPAR, 0); }
		public ParenthesisContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode ID() { return getToken(RPNCalculatorParser.ID, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(RPNCalculatorParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INT() { return getToken(RPNCalculatorParser.INT, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RPNCalculatorVisitor ) return ((RPNCalculatorVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(DOUBLE);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(ID);
				}
				break;
			case LPAR:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(LPAR);
				setState(98);
				addOrSub(0);
				setState(99);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 2:
			return addOrSub_sempred((AddOrSubContext)_localctx, predIndex);
		case 3:
			return mulOrDiv_sempred((MulOrDivContext)_localctx, predIndex);
		case 5:
			return trig_sempred((TrigContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addOrSub_sempred(AddOrSubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mulOrDiv_sempred(MulOrDivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean trig_sempred(TrigContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4&\n"+
		"\4\r\4\16\4\'\3\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\4\3\4\7\4\64\n\4\f"+
		"\4\16\4\67\13\4\3\5\3\5\3\5\3\5\3\5\6\5>\n\5\r\5\16\5?\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bh\n\b\3\b\2\5\6\b\f\t\2\4\6\b\n\f\16\2\2\2r\2\32\3\2\2\2\4"+
		"\34\3\2\2\2\6 \3\2\2\2\b8\3\2\2\2\nL\3\2\2\2\fR\3\2\2\2\16g\3\2\2\2\20"+
		"\21\5\4\3\2\21\22\7\16\2\2\22\23\5\2\2\2\23\33\3\2\2\2\24\26\5\6\4\2\25"+
		"\27\7\16\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\2\2\3\31"+
		"\33\3\2\2\2\32\20\3\2\2\2\32\24\3\2\2\2\33\3\3\2\2\2\34\35\7\20\2\2\35"+
		"\36\7\13\2\2\36\37\5\6\4\2\37\5\3\2\2\2 !\b\4\1\2!\"\5\b\5\2\"\65\3\2"+
		"\2\2#%\f\5\2\2$&\5\b\5\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()"+
		"\3\2\2\2)*\7\6\2\2*\64\3\2\2\2+-\f\4\2\2,.\5\b\5\2-,\3\2\2\2./\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\7\2\2\62\64\3\2\2\2\63#\3"+
		"\2\2\2\63+\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2"+
		"\2\2\67\65\3\2\2\289\b\5\1\29:\5\n\6\2:I\3\2\2\2;=\f\5\2\2<>\5\n\6\2="+
		"<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\b\2\2BH\3\2\2\2"+
		"CD\f\4\2\2DE\5\n\6\2EF\7\t\2\2FH\3\2\2\2G;\3\2\2\2GC\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LP\5\f\7\2MN\5\n\6\2NO\7\n\2"+
		"\2OQ\3\2\2\2PM\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RS\b\7\1\2ST\5\16\b\2T]\3"+
		"\2\2\2UV\f\6\2\2V\\\7\3\2\2WX\f\5\2\2X\\\7\4\2\2YZ\f\4\2\2Z\\\7\5\2\2"+
		"[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2"+
		"\2_]\3\2\2\2`h\7\21\2\2ah\7\22\2\2bh\7\20\2\2cd\7\f\2\2de\5\6\4\2ef\7"+
		"\r\2\2fh\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\17\3\2\2\2\17"+
		"\26\32\'/\63\65?GIP[]g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}