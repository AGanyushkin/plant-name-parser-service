package pro.ganyushkin.mimir.plant_name_parser.domain;

import lombok.Getter;

@Getter
public class BaseNamePart {
    private final String text;

    public BaseNamePart(String text) {
        this.text = text;
    }
}
