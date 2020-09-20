import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("Michael");
        list.add("a");
        list.add("");
        list.add("Michael");
        System.out.println(contains_3(list));

    }


    static boolean contains_3(List<String> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);

                if (map.get(str) == 3)
                    return true;
            } else {
                map.put(str, 1);
            }
        }
        return false;
    }

    static boolean contains3(List<String> list) {
        int index = 0;
        int key = 1;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(index).equals(list.get(i))) {
                index++;
                map.put(key, list.get(index));
                key++;
                System.out.println(map);
            }
            if (map.size() >= 2) {
                return true;
            }
        }
        return false;
    }
}
