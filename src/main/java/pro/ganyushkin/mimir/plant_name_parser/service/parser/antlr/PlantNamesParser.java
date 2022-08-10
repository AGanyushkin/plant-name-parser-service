package pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr;// Generated from com\seed\search_service\name_parser\parser\PlantNames.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlantNamesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DOT=2, PARENTS=3, BRACKET=4, COMMA=5, INSETDELIMITER=6, STR=7, SUBSPECIESPREFIX=8, 
		VARIETYPREFIX=9, SEL=10, FORMPREFIX=11;
	public static final int
		RULE_dot = 0, RULE_insetdelimiter = 1, RULE_namestr = 2, RULE_genus = 3, 
		RULE_species = 4, RULE_subspecies = 5, RULE_variety = 6, RULE_abbr = 7, 
		RULE_cultivarname = 8, RULE_cultivar = 9, RULE_form = 10, RULE_alternative = 11, 
		RULE_plantname = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"dot", "insetdelimiter", "namestr", "genus", "species", "subspecies", 
			"variety", "abbr", "cultivarname", "cultivar", "form", "alternative", 
			"plantname"
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

	@Override
	public String getGrammarFileName() { return "PlantNames.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlantNamesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PlantNamesParser.DOT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(DOT);
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

	public static class InsetdelimiterContext extends ParserRuleContext {
		public TerminalNode INSETDELIMITER() { return getToken(PlantNamesParser.INSETDELIMITER, 0); }
		public InsetdelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insetdelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterInsetdelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitInsetdelimiter(this);
		}
	}

	public final InsetdelimiterContext insetdelimiter() throws RecognitionException {
		InsetdelimiterContext _localctx = new InsetdelimiterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insetdelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(INSETDELIMITER);
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

	public static class NamestrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(PlantNamesParser.STR, 0); }
		public NamestrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namestr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterNamestr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitNamestr(this);
		}
	}

	public final NamestrContext namestr() throws RecognitionException {
		NamestrContext _localctx = new NamestrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namestr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(STR);
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

	public static class GenusContext extends ParserRuleContext {
		public NamestrContext namestr() {
			return getRuleContext(NamestrContext.class,0);
		}
		public GenusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterGenus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitGenus(this);
		}
	}

	public final GenusContext genus() throws RecognitionException {
		GenusContext _localctx = new GenusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			namestr();
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

	public static class SpeciesContext extends ParserRuleContext {
		public NamestrContext namestr() {
			return getRuleContext(NamestrContext.class,0);
		}
		public SpeciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_species; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterSpecies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitSpecies(this);
		}
	}

	public final SpeciesContext species() throws RecognitionException {
		SpeciesContext _localctx = new SpeciesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_species);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			namestr();
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

	public static class SubspeciesContext extends ParserRuleContext {
		public TerminalNode SUBSPECIESPREFIX() { return getToken(PlantNamesParser.SUBSPECIESPREFIX, 0); }
		public List<NamestrContext> namestr() {
			return getRuleContexts(NamestrContext.class);
		}
		public NamestrContext namestr(int i) {
			return getRuleContext(NamestrContext.class,i);
		}
		public SubspeciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subspecies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterSubspecies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitSubspecies(this);
		}
	}

	public final SubspeciesContext subspecies() throws RecognitionException {
		SubspeciesContext _localctx = new SubspeciesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subspecies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(SUBSPECIESPREFIX);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				namestr();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
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

	public static class VarietyContext extends ParserRuleContext {
		public TerminalNode VARIETYPREFIX() { return getToken(PlantNamesParser.VARIETYPREFIX, 0); }
		public List<NamestrContext> namestr() {
			return getRuleContexts(NamestrContext.class);
		}
		public NamestrContext namestr(int i) {
			return getRuleContext(NamestrContext.class,i);
		}
		public VarietyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterVariety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitVariety(this);
		}
	}

	public final VarietyContext variety() throws RecognitionException {
		VarietyContext _localctx = new VarietyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variety);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VARIETYPREFIX);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				namestr();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
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

	public static class AbbrContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(PlantNamesParser.STR, 0); }
		public TerminalNode DOT() { return getToken(PlantNamesParser.DOT, 0); }
		public AbbrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterAbbr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitAbbr(this);
		}
	}

	public final AbbrContext abbr() throws RecognitionException {
		AbbrContext _localctx = new AbbrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abbr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(STR);
			setState(49);
			match(DOT);
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

	public static class CultivarnameContext extends ParserRuleContext {
		public List<NamestrContext> namestr() {
			return getRuleContexts(NamestrContext.class);
		}
		public NamestrContext namestr(int i) {
			return getRuleContext(NamestrContext.class,i);
		}
		public List<AbbrContext> abbr() {
			return getRuleContexts(AbbrContext.class);
		}
		public AbbrContext abbr(int i) {
			return getRuleContext(AbbrContext.class,i);
		}
		public CultivarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cultivarname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterCultivarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitCultivarname(this);
		}
	}

	public final CultivarnameContext cultivarname() throws RecognitionException {
		CultivarnameContext _localctx = new CultivarnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cultivarname);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					namestr();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
						namestr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(63); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(62);
						abbr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(65); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STR) {
				{
				{
				setState(69);
				namestr();
				}
				}
				setState(74);
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

	public static class CultivarContext extends ParserRuleContext {
		public List<TerminalNode> PARENTS() { return getTokens(PlantNamesParser.PARENTS); }
		public TerminalNode PARENTS(int i) {
			return getToken(PlantNamesParser.PARENTS, i);
		}
		public CultivarnameContext cultivarname() {
			return getRuleContext(CultivarnameContext.class,0);
		}
		public TerminalNode SEL() { return getToken(PlantNamesParser.SEL, 0); }
		public CultivarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cultivar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterCultivar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitCultivar(this);
		}
	}

	public final CultivarContext cultivar() throws RecognitionException {
		CultivarContext _localctx = new CultivarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cultivar);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(75);
				match(PARENTS);
				setState(76);
				cultivarname();
				setState(77);
				match(PARENTS);
				}
				}
				break;
			case SEL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(79);
				match(SEL);
				setState(80);
				cultivarname();
				}
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode FORMPREFIX() { return getToken(PlantNamesParser.FORMPREFIX, 0); }
		public List<NamestrContext> namestr() {
			return getRuleContexts(NamestrContext.class);
		}
		public NamestrContext namestr(int i) {
			return getRuleContext(NamestrContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FORMPREFIX);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				namestr();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<TerminalNode> BRACKET() { return getTokens(PlantNamesParser.BRACKET); }
		public TerminalNode BRACKET(int i) {
			return getToken(PlantNamesParser.BRACKET, i);
		}
		public List<NamestrContext> namestr() {
			return getRuleContexts(NamestrContext.class);
		}
		public NamestrContext namestr(int i) {
			return getRuleContext(NamestrContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(BRACKET);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				namestr();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STR );
			setState(95);
			match(BRACKET);
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

	public static class PlantnameContext extends ParserRuleContext {
		public GenusContext genus() {
			return getRuleContext(GenusContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlantNamesParser.EOF, 0); }
		public InsetdelimiterContext insetdelimiter() {
			return getRuleContext(InsetdelimiterContext.class,0);
		}
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public SpeciesContext species() {
			return getRuleContext(SpeciesContext.class,0);
		}
		public SubspeciesContext subspecies() {
			return getRuleContext(SubspeciesContext.class,0);
		}
		public VarietyContext variety() {
			return getRuleContext(VarietyContext.class,0);
		}
		public CultivarContext cultivar() {
			return getRuleContext(CultivarContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public PlantnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plantname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).enterPlantname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantNamesListener ) ((PlantNamesListener)listener).exitPlantname(this);
		}
	}

	public final PlantnameContext plantname() throws RecognitionException {
		PlantnameContext _localctx = new PlantnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_plantname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			genus();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSETDELIMITER) {
				{
				setState(98);
				insetdelimiter();
				}
			}

			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(101);
				alternative();
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(104);
				species();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACKET) {
				{
				setState(107);
				alternative();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBSPECIESPREFIX) {
				{
				setState(110);
				subspecies();
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIETYPREFIX) {
				{
				setState(113);
				variety();
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTS || _la==SEL) {
				{
				setState(116);
				cultivar();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMPREFIX) {
				{
				setState(119);
				form();
				}
			}

			setState(122);
			match(EOF);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\6\7)\n\7\r\7\16\7*\3\b\3\b\6\b/\n\b\r\b\16\b\60\3\t\3\t\3\t\3\n\7"+
		"\n\67\n\n\f\n\16\n:\13\n\3\n\6\n=\n\n\r\n\16\n>\3\n\6\nB\n\n\r\n\16\n"+
		"C\5\nF\n\n\3\n\7\nI\n\n\f\n\16\nL\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13T\n\13\3\f\3\f\6\fX\n\f\r\f\16\fY\3\r\3\r\6\r^\n\r\r\r\16\r_\3\r\3"+
		"\r\3\16\3\16\5\16f\n\16\3\16\5\16i\n\16\3\16\5\16l\n\16\3\16\5\16o\n\16"+
		"\3\16\5\16r\n\16\3\16\5\16u\n\16\3\16\5\16x\n\16\3\16\5\16{\n\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u0083\2\34\3"+
		"\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16,\3"+
		"\2\2\2\20\62\3\2\2\2\228\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2\30[\3\2\2\2\32"+
		"c\3\2\2\2\34\35\7\4\2\2\35\3\3\2\2\2\36\37\7\b\2\2\37\5\3\2\2\2 !\7\t"+
		"\2\2!\7\3\2\2\2\"#\5\6\4\2#\t\3\2\2\2$%\5\6\4\2%\13\3\2\2\2&(\7\n\2\2"+
		"\')\5\6\4\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\r\3\2\2\2,.\7\13"+
		"\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\17\3"+
		"\2\2\2\62\63\7\t\2\2\63\64\7\4\2\2\64\21\3\2\2\2\65\67\5\6\4\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29E\3\2\2\2:8\3\2\2\2;=\5\6\4\2"+
		"<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?F\3\2\2\2@B\5\20\t\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E<\3\2\2\2EA\3\2\2\2FJ\3\2\2"+
		"\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\23\3\2\2\2LJ\3\2"+
		"\2\2MN\7\5\2\2NO\5\22\n\2OP\7\5\2\2PT\3\2\2\2QR\7\f\2\2RT\5\22\n\2SM\3"+
		"\2\2\2SQ\3\2\2\2T\25\3\2\2\2UW\7\r\2\2VX\5\6\4\2WV\3\2\2\2XY\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Z\27\3\2\2\2[]\7\6\2\2\\^\5\6\4\2]\\\3\2\2\2^_\3\2"+
		"\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\6\2\2b\31\3\2\2\2ce\5\b\5\2df\5"+
		"\4\3\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\5\30\r\2hg\3\2\2\2hi\3\2\2\2ik"+
		"\3\2\2\2jl\5\n\6\2kj\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5\30\r\2nm\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pr\5\f\7\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\16\b"+
		"\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\5\24\13\2wv\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2y{\5\26\f\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\2\2\3}\33\3\2\2\2\24"+
		"*\608>CEJSY_ehknqtwz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}