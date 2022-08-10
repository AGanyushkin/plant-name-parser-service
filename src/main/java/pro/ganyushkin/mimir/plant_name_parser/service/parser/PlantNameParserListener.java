package pro.ganyushkin.mimir.plant_name_parser.service.parser;

import pro.ganyushkin.mimir.plant_name_parser.domain.BaseNamePart;
import pro.ganyushkin.mimir.plant_name_parser.domain.ParsedPlantName;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr.PlantNamesBaseListener;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr.PlantNamesParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.ArrayList;
import java.util.List;

public class PlantNameParserListener extends PlantNamesBaseListener {

    private List<String> errors = new ArrayList<>();
    private ParsedPlantName parsedName = new ParsedPlantName();

    private final StringBuilder text = new StringBuilder();

    public String getError() {
        return String.join("\n", errors);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public ParsedPlantName getParsedName() {
        return this.parsedName;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errors.add(node.toString());
    }

    @Override
    public void enterNamestr(PlantNamesParser.NamestrContext ctx) {
        addText(ctx);
    }

    @Override
    public void enterAbbr(PlantNamesParser.AbbrContext ctx) {
        addText(ctx);
    }

    private void addText(ParserRuleContext ctx) {
        if (text.length() > 0) {
            text.append(" ");
        }
        text.append(ctx.getText());
    }

    @Override
    public void enterGenus(PlantNamesParser.GenusContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitGenus(PlantNamesParser.GenusContext ctx) {
        parsedName.setGenus(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterSpecies(PlantNamesParser.SpeciesContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitSpecies(PlantNamesParser.SpeciesContext ctx) {
        parsedName.setSpecies(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterCultivarname(PlantNamesParser.CultivarnameContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitCultivarname(PlantNamesParser.CultivarnameContext ctx) {
        parsedName.setCultivar(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterAlternative(PlantNamesParser.AlternativeContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitAlternative(PlantNamesParser.AlternativeContext ctx) {
        parsedName.setAlternative(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterVariety(PlantNamesParser.VarietyContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitVariety(PlantNamesParser.VarietyContext ctx) {
        parsedName.setVariety(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterSubspecies(PlantNamesParser.SubspeciesContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitSubspecies(PlantNamesParser.SubspeciesContext ctx) {
        parsedName.setSubspecies(new BaseNamePart(text.toString()));
    }

    @Override
    public void enterForm(PlantNamesParser.FormContext ctx) {
        text.setLength(0);
    }

    @Override
    public void exitForm(PlantNamesParser.FormContext ctx) {
        parsedName.setForm(new BaseNamePart(text.toString()));
    }
}
