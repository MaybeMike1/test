import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);

        System.out.println(arrayList.size());
        removeFirst(arrayList);
        System.out.println(arrayList.clone());
        System.out.print(cloneArrayList(arrayList));


    }

    static void removeFirst(ArrayList<Integer> arrayList) {
        arrayList.remove(1);
    }

    static Object cloneArrayList(ArrayList arrayList) {
        return arrayList.clone();
    }

}
