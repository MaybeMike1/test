import java.util.HashSet;
import java.util.Set;

public class MaxLengthCalculator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bob");
        set.add("loll");
        set.add("asdasd");
        set.add("asdasdas");
        set.add("asdasd");
        set.add("asdasd");

        System.out.println(maxLength((set)));

    }

   public static int maxLength(Set<String> set) {
        String longestString = "";
        for(String word : set) {
            if(longestString.length() < word.length()){
                longestString = word;
            }

        }
        return longestString.length();
    }
}
