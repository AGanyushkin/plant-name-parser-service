package pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr;// Generated from com\seed\search_service\name_parser\parser\PlantNames.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlantNamesParser}.
 */
public interface PlantNamesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(PlantNamesParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(PlantNamesParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#insetdelimiter}.
	 * @param ctx the parse tree
	 */
	void enterInsetdelimiter(PlantNamesParser.InsetdelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#insetdelimiter}.
	 * @param ctx the parse tree
	 */
	void exitInsetdelimiter(PlantNamesParser.InsetdelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#namestr}.
	 * @param ctx the parse tree
	 */
	void enterNamestr(PlantNamesParser.NamestrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#namestr}.
	 * @param ctx the parse tree
	 */
	void exitNamestr(PlantNamesParser.NamestrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#genus}.
	 * @param ctx the parse tree
	 */
	void enterGenus(PlantNamesParser.GenusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#genus}.
	 * @param ctx the parse tree
	 */
	void exitGenus(PlantNamesParser.GenusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#species}.
	 * @param ctx the parse tree
	 */
	void enterSpecies(PlantNamesParser.SpeciesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#species}.
	 * @param ctx the parse tree
	 */
	void exitSpecies(PlantNamesParser.SpeciesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#subspecies}.
	 * @param ctx the parse tree
	 */
	void enterSubspecies(PlantNamesParser.SubspeciesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#subspecies}.
	 * @param ctx the parse tree
	 */
	void exitSubspecies(PlantNamesParser.SubspeciesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#variety}.
	 * @param ctx the parse tree
	 */
	void enterVariety(PlantNamesParser.VarietyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#variety}.
	 * @param ctx the parse tree
	 */
	void exitVariety(PlantNamesParser.VarietyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#abbr}.
	 * @param ctx the parse tree
	 */
	void enterAbbr(PlantNamesParser.AbbrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#abbr}.
	 * @param ctx the parse tree
	 */
	void exitAbbr(PlantNamesParser.AbbrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#cultivarname}.
	 * @param ctx the parse tree
	 */
	void enterCultivarname(PlantNamesParser.CultivarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#cultivarname}.
	 * @param ctx the parse tree
	 */
	void exitCultivarname(PlantNamesParser.CultivarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#cultivar}.
	 * @param ctx the parse tree
	 */
	void enterCultivar(PlantNamesParser.CultivarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#cultivar}.
	 * @param ctx the parse tree
	 */
	void exitCultivar(PlantNamesParser.CultivarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(PlantNamesParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(PlantNamesParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(PlantNamesParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(PlantNamesParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantNamesParser#plantname}.
	 * @param ctx the parse tree
	 */
	void enterPlantname(PlantNamesParser.PlantnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantNamesParser#plantname}.
	 * @param ctx the parse tree
	 */
	void exitPlantname(PlantNamesParser.PlantnameContext ctx);
}