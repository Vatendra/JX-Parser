import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
    String xmlData;
    XmlToJson(String s){
        xmlData = s;
    }
    String toJson(){
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        return jsonObject.toString(4);
    }
}
