import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("Faluda");
        lst.add("Hotpot");
        lst.add("Honey Lemon Tea");
        System.out.println("My LinkedList " + lst);
        lst.add(1, "LemonTea");
        System.out.println("Update LinkedList " + lst);
        System.out.println("At Index no 2 " + lst.get(2));

        String searchValue = "Honey Lemon Tea";
        if(lst.contains(searchValue)){
            System.out.println("Found " + searchValue);

            lst.remove(searchValue);
            System.out.println("Remain List " + lst);
        }
    }
}
