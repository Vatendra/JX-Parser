import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
    String xmlData;
    XmlToJson(String s){
        xmlData = s;
    }
    String toJson(){
        JSONObject jsonObject;
        try{
            jsonObject = XML.toJSONObject(xmlData);
        }
        catch (JSONException jsonException){
            return jsonException.getLocalizedMessage();
        }
        return jsonObject.toString(4);
    }
}
