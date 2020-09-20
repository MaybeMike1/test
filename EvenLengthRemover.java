import java.util.HashSet;
import java.util.Set;

public class EvenLengthRemover {
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("as");
    set.add("asd");
    set.add("asdss");
    removeEven(set);

    System.out.println(set);

    }

    static void removeEven(Set<String> set) {
        set.removeIf(word -> word.length() % 2 == 0);
    }
}
