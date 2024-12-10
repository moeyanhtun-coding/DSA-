import java.util.HashSet;

public class SetDataStructure {
    public static void main(String[] args) {
        // cn store non-duplicate value / can store unique data
        // set - HashSet and TreeSet
        // hash function and hash code to store data

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        hs.add(200);
        System.out.println(hs);
    }
}
