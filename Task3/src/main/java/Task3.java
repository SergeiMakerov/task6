import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Task3 {
    public static void main(String[] args) {
        String json = "[" +
                "{\"family\":\"Ivanov\"," +"\"оценка\":\"a\","+"\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\","+"\"оценка\":\"d\","+"\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\","+"\"оценка\":\"b\","+"\"предмет\":\"Физика\"}"+"]";
        parseStringWithSimpleJson(json);
    }
    @SneakyThrows
    private static void parseStringWithSimpleJson(String json) {
        Object obj = new JSONParser().parse(json);
        JSONArray array = (JSONArray) obj;
        for (Object o : array) {
            JSONObject jsonObject = (JSONObject) o;
            StringBuilder builder = new StringBuilder("Студент ");
            builder.append(jsonObject.get("фамилия"))
                    .append(" получил оценку ")
                    .append(jsonObject.get("оценка"))
                    .append(" по предмету ")
                    .append(jsonObject.get("предмет"));
            System.out.println(builder);
        }
    }
}
