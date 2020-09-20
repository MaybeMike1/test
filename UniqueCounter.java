import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueCounter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        countUnique(list);
    }

    static int countUnique(List<Integer> list) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i = 0; i < list.size(); i++) {
            uniqueNumbers.add(list.get(i));
        }
        System.out.println(uniqueNumbers.size());
        return uniqueNumbers.size();
    }
}
