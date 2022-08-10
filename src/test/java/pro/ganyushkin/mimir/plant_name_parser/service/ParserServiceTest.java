package pro.ganyushkin.mimir.plant_name_parser.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pro.ganyushkin.mimir.plant_name_parser.controller.v1.ParserRequest;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.ParsingException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ParserServiceTest {

    @Autowired
    private ParserService nameParser;

    @ParameterizedTest
    @CsvFileSource(resources = "/invalid_plant_names.csv", numLinesToSkip = 1)
    void invalidSamples(String plantName) {
        assertThrows(ParsingException.class, () -> {
            nameParser.parse(new ParserRequest(plantName));
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/valid_plant_names.csv", numLinesToSkip = 1)
    void validSample(String plantName, String genus, String species, String subspecies,
               String cultivar, String form, String alt, String variety) throws ParsingException {

        var parsed = nameParser.parse(new ParserRequest(plantName));

        if (genus != null) {
            assertNotNull(parsed.getGenus());
            assertEquals(genus, parsed.getGenus().getText());
        }
        if (species != null) {
            assertNotNull(parsed.getSpecies());
            assertEquals(species, parsed.getSpecies().getText());
        }
        if (subspecies != null) {
            assertNotNull(parsed.getSubspecies());
            assertEquals(subspecies, parsed.getSubspecies().getText());
        }
        if (cultivar != null) {
            assertNotNull(parsed.getCultivar());
            assertEquals(cultivar, parsed.getCultivar().getText());
        }
        if (form != null) {
            assertNotNull(parsed.getForm());
            assertEquals(form, parsed.getForm().getText());
        }
        if (alt != null) {
            assertNotNull(parsed.getAlternative());
            assertEquals(alt, parsed.getAlternative().getText());
        }
        if (variety != null) {
            assertNotNull(parsed.getVariety());
            assertEquals(variety, parsed.getVariety().getText());
        }
    }
}
