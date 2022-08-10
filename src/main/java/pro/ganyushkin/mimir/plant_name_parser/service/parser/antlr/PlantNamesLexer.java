package pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr;// Generated from com\seed\search_service\name_parser\parser\PlantNames.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlantNamesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DOT=2, PARENTS=3, BRACKET=4, COMMA=5, INSETDELIMITER=6, STR=7, SUBSPECIESPREFIX=8, 
		VARIETYPREFIX=9, SEL=10, FORMPREFIX=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "DOT", "PARENTS", "BRACKET", "COMMA", "DIGIT", "INSETDELIMITER", 
			"STR", "SUBSPECIESPREFIX", "VARIETYPREFIX", "SEL", "FORMPREFIX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DOT", "PARENTS", "BRACKET", "COMMA", "INSETDELIMITER", "STR", 
			"SUBSPECIESPREFIX", "VARIETYPREFIX", "SEL", "FORMPREFIX"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PlantNamesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlantNames.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\60\n\t\r\t\16\t\61\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nA\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13P\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r]\n\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t"+
		"\6\13\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\3\2\b\5\2\13\f\17\17\"\"\b"+
		"\2$$))\u00ad\u00ad\u00bd\u00bd\u0414\u0414\u201e\u201f\3\2*+\3\2\62;\4"+
		"\2zz\u00d9\u00d9\b\2//\62;C\\c|\u00c2\u0101\u0402\u0501\2c\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2"+
		"\2\5\"\3\2\2\2\7$\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17,\3\2\2"+
		"\2\21/\3\2\2\2\23@\3\2\2\2\25O\3\2\2\2\27S\3\2\2\2\31\\\3\2\2\2\33\35"+
		"\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3"+
		"\2\2\2 !\b\2\2\2!\4\3\2\2\2\"#\7\60\2\2#\6\3\2\2\2$%\t\3\2\2%\b\3\2\2"+
		"\2&\'\t\4\2\2\'\n\3\2\2\2()\7.\2\2)\f\3\2\2\2*+\t\5\2\2+\16\3\2\2\2,-"+
		"\t\6\2\2-\20\3\2\2\2.\60\t\7\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\22\3\2\2\2\63\64\7u\2\2\64\65\7w\2\2\65\66\7d\2\2\66\67"+
		"\7u\2\2\67A\7r\2\289\7\u0422\2\29:\7\u0459\2\2:;\7\u0422\2\2;<\7\u0457"+
		"\2\2<=\7\u0422\2\2=>\7\u0493\2\2>?\7\u0422\2\2?A\7\u0408\2\2@\63\3\2\2"+
		"\2@8\3\2\2\2AB\3\2\2\2BC\5\5\3\2C\24\3\2\2\2DE\7x\2\2EF\7c\2\2FP\7t\2"+
		"\2GH\7\u0423\2\2HI\7\u0404\2\2IJ\7\u0422\2\2JK\7\u00b2\2\2KL\7\u0422\2"+
		"\2LM\7\u00b9\2\2MN\7\u0422\2\2NP\7\u0407\2\2OD\3\2\2\2OG\3\2\2\2PQ\3\2"+
		"\2\2QR\5\5\3\2R\26\3\2\2\2ST\7u\2\2TU\7g\2\2UV\7n\2\2VW\3\2\2\2WX\5\5"+
		"\3\2X\30\3\2\2\2Y]\7h\2\2Z[\7\u0423\2\2[]\7\u2020\2\2\\Y\3\2\2\2\\Z\3"+
		"\2\2\2]^\3\2\2\2^_\5\5\3\2_\32\3\2\2\2\b\2\36\61@O\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}