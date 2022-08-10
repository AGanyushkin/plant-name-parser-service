package pro.ganyushkin.mimir.plant_name_parser.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ParsedPlantNameTest {

    @Test
    public void toStringWithCommonParts() {
        var name = new ParsedPlantName();
        name.setGenus(new BaseNamePart("Fagus"));
        name.setSpecies(new BaseNamePart("sylvatica"));
        name.setCultivar(new BaseNamePart("Laciniata"));

        assertEquals("Fagus sylvatica 'Laciniata'", name.toString());
    }

    @Test
    public void toStringWithAllCommonParts() {
        var name = new ParsedPlantName();
        name.setGenus(new BaseNamePart("Fagus"));
        name.setSpecies(new BaseNamePart("sylvatica"));
        name.setSubspecies(new BaseNamePart("subfagus"));
        name.setCultivar(new BaseNamePart("Laciniata"));
        name.setForm(new BaseNamePart("PlantForm"));
        name.setAlternative(new BaseNamePart("altname"));
        name.setVariety(new BaseNamePart("varname"));

        assertEquals(
                "Fagus (altname) sylvatica subsp. subfagus var. varname 'Laciniata' f. PlantForm",
                name.toString());
    }

    @Test
    public void toStringWithVarietyOnly() {
        var name = new ParsedPlantName();
        name.setGenus(new BaseNamePart("Fagus"));
        name.setSpecies(new BaseNamePart("sylvatica"));
        name.setVariety(new BaseNamePart("varname"));

        assertEquals(
                "Fagus sylvatica var. varname",
                name.toString());
    }
}