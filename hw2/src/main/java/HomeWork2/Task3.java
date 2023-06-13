package HomeWork2;
/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */

import lombok.SneakyThrows;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Task3 {
    public static void main(String[] args) {
        String json = "[" +
                "{\"фамилия\":\"Иванов\"," +"\"оценка\":\"a\","+"\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\","+"\"оценка\":\"d\","+"\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\","+"\"оценка\":\"b\","+"\"предмет\":\"Физика\"}"+"]";
        parseStringWithSimpleJson(json);
    }
    @SneakyThrows
    private static <JSONArray, JSONObject> void parseStringWithSimpleJson(String json) {
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
