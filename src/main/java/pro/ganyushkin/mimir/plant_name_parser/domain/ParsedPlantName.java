package pro.ganyushkin.mimir.plant_name_parser.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class ParsedPlantName {
    private BaseNamePart genus;
    private BaseNamePart species;
    private BaseNamePart subspecies;
    private BaseNamePart alternative;
    private BaseNamePart variety;
    private BaseNamePart cultivar;
    private BaseNamePart form;

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(genus.getText());
        if (alternative != null) {
            builder.append(" ")
                    .append("(")
                    .append(alternative.getText())
                    .append(")");
        }
        if (species != null) {
            builder.append(" ")
                    .append(species.getText());
        }
        if (subspecies != null) {
            builder.append(" ")
                    .append("subsp.")
                    .append(" ")
                    .append(subspecies.getText());
        }
        if (variety != null) {
            builder.append(" ")
                    .append("var.")
                    .append(" ")
                    .append(variety.getText());
        }
        if (cultivar != null) {
            builder.append(" ")
                    .append("'")
                    .append(cultivar.getText())
                    .append("'");
        }
        if (form != null) {
            builder.append(" ")
                    .append("f.")
                    .append(" ")
                    .append(form.getText());
        }
        return builder.toString();
    }
}
