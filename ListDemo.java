import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Bent");
        ArrayList<String> list = new ArrayList();
        list.add("Anna");
        printList(linkedList);
        printList(list);
        // list.get(0).length();
    }

    static void printList(List list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
