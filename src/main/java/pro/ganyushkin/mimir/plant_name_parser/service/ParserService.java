package pro.ganyushkin.mimir.plant_name_parser.service;

import lombok.extern.slf4j.Slf4j;
import pro.ganyushkin.mimir.plant_name_parser.controller.v1.ParserRequest;
import pro.ganyushkin.mimir.plant_name_parser.domain.ParsedPlantName;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr.PlantNamesLexer;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.antlr.PlantNamesParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Component;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.LexerErrorListener;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.ParsingException;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.PlantNameParserListener;

@Slf4j
@Component
public class ParserService {

    public ParsedPlantName parse(ParserRequest request) throws ParsingException {
        var listener= new PlantNameParserListener();

        ParseTree parsedTree;
        try {
            parsedTree = parseTree(request.getText());
        } catch (RuntimeException e) {
            throw new ParsingException(listener.getError());
        }

        new ParseTreeWalker().walk(listener, parsedTree);

        if (listener.hasErrors()) {
            throw new ParsingException(listener.getError());
        }
        var parsedName = listener.getParsedName();
        if (parsedName == null) {
            throw new ParsingException("Parsing errors, like: token recognition error");
        }

        return parsedName;
    }

    private ParseTree parseTree(String text) {
        PlantNamesLexer lexer = new PlantNamesLexer(CharStreams.fromString(text));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlantNamesParser parser = new PlantNamesParser(tokens);
        return parser.plantname();
    }
}
