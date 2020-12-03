// Generated from RPNCalculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RPNCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIN=1, COS=2, TAN=3, ADD=4, SUB=5, MUL=6, DIV=7, POW=8, EQUAL=9, LPAR=10, 
		RPAR=11, NL=12, WS=13, ID=14, INT=15, DOUBLE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SIN", "COS", "TAN", "ADD", "SUB", "MUL", "DIV", "POW", "EQUAL", "LPAR", 
		"RPAR", "NL", "WS", "ID", "INT", "DOUBLE"
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


	public RPNCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RPNCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16C\n\16\r\16\16\16"+
		"D\3\16\3\16\3\17\3\17\7\17K\n\17\f\17\16\17N\13\17\3\20\6\20Q\n\20\r\20"+
		"\16\20R\3\21\6\21V\n\21\r\21\16\21W\3\21\3\21\6\21\\\n\21\r\21\16\21]"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\7\4\2\f\f==\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\2c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\3#\3\2\2\2\5\'\3\2\2\2\7+\3\2\2\2\t/\3\2\2\2\13\61\3\2\2"+
		"\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27"+
		"=\3\2\2\2\31?\3\2\2\2\33B\3\2\2\2\35H\3\2\2\2\37P\3\2\2\2!U\3\2\2\2#$"+
		"\7u\2\2$%\7k\2\2%&\7p\2\2&\4\3\2\2\2\'(\7e\2\2()\7q\2\2)*\7u\2\2*\6\3"+
		"\2\2\2+,\7v\2\2,-\7c\2\2-.\7p\2\2.\b\3\2\2\2/\60\7-\2\2\60\n\3\2\2\2\61"+
		"\62\7/\2\2\62\f\3\2\2\2\63\64\7,\2\2\64\16\3\2\2\2\65\66\7\61\2\2\66\20"+
		"\3\2\2\2\678\7`\2\28\22\3\2\2\29:\7?\2\2:\24\3\2\2\2;<\7*\2\2<\26\3\2"+
		"\2\2=>\7+\2\2>\30\3\2\2\2?@\t\2\2\2@\32\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\16\2\2G\34\3\2\2\2HL\t\4\2"+
		"\2IK\t\5\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\36\3\2\2\2NL\3\2"+
		"\2\2OQ\t\6\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S \3\2\2\2TV\t\6"+
		"\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\60\2\2Z\\\t"+
		"\6\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\"\3\2\2\2\b\2DLRW]\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}