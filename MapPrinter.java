import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrinter<K, V> {
    public static void main(String[] args) {
       MapPrinter<String, Double> mapPrinter = new MapPrinter();
    }

    public MapPrinter() {
        //Hvad er et map?
        int tal = 5;
        Integer andetTal = 5;
        Map<String, Double> movieMap = new TreeMap<>();
        movieMap.put("Matrix", 5.0);
        movieMap.put("Braveheart", 5.0);
        movieMap.put("Big Lebowsky", 2.0);
        movieMap.put("Verden Udenfor", 5.0);
        movieMap.put("Star Wars", 3.0);


    }

    void printMap(Map<K, V> map) {
        for(Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
