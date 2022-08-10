package pro.ganyushkin.mimir.plant_name_parser.service.parser;

public class ParsingException extends Exception {
    public ParsingException(String s, Exception e) {
        super(s, e);
    }

    public ParsingException(String error) {
        super(error);
    }
}
