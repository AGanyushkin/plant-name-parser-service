package pro.ganyushkin.mimir.plant_name_parser.controller.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pro.ganyushkin.mimir.plant_name_parser.service.ParserService;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.ParsingException;
import pro.ganyushkin.mimir.plant_name_parser.domain.ParsedPlantName;
import org.springframework.http.MediaType;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/parse")
public class ParserController {
    private final ParserService parserService;

    @RequestMapping(method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ParsedPlantName> parsePlantName(@RequestBody ParserRequest request) {
        log.info("parsing: \"{}\"", request);
        try {
            return ResponseEntity.ok(parserService.parse(request));
        } catch (ParsingException e) {
            log.error("parsing error for: \"" + request.getText() + "\"");
            return ResponseEntity.internalServerError().build();
        }
    }
}
