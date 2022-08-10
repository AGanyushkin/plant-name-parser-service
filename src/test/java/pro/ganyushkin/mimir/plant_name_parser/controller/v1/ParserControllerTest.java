package pro.ganyushkin.mimir.plant_name_parser.controller.v1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import pro.ganyushkin.mimir.plant_name_parser.service.ParserService;
import pro.ganyushkin.mimir.plant_name_parser.service.parser.ParsingException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ParserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ParserService parserService;

    @Test
    public void restApiShouldWorks() throws Exception {
        mockMvc.perform(post("/api/v1/parse")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"text\": \"Betula penduls\" }"))
                .andExpect(status().isOk());
        verify(parserService, times(1)).parse(any(ParserRequest.class));
    }

    @Test
    public void shouldFail() throws Exception {
        when(parserService.parse(any(ParserRequest.class)))
                .thenThrow(new ParsingException("test exception"));
        mockMvc.perform(post("/api/v1/parse")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"text\": \"Betula penduls\" }"))
                .andExpect(status().isInternalServerError());
    }
}