import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("a", "candy");
        mapBully(map);
        System.out.println(map);

    }
    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.replace("a", map.get("a"), "");
        }
        return map;
    }

}
