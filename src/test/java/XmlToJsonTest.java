import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlToJsonTest {
    String xmlData = "<root>data</root>";
    String jsonOutput = "{\"root\": \"data\"}";
    XmlToJson xmlToJson = new XmlToJson(xmlData);
    XmlToJson xmlToJsonForNull = new XmlToJson("");
    @Test
    public void testXmlToJson(){
        assertEquals(jsonOutput,xmlToJson.toJson());
        assertEquals("{}",xmlToJsonForNull.toJson()); // For null input
    }
}