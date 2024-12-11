import java.util.*;

public class SetDataStructure {
    public static void main(String[] args) {
        // can store non-duplicate value / can store unique data
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

        Integer[] array = hs.toArray(new Integer[hs.size()]);

        System.out.println(array[1]);

        List<Integer> ls = new ArrayList<Integer>(hs);
        System.out.println(ls.get(1));

        LinkedList<Integer> ll = new LinkedList<Integer>(hs);
        System.out.println(ll.get(3));

        // using iterator
        System.out.println("---- Using Iterator Object ----");
        Iterator it  = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        if(hs.contains(100)){
            System.out.println("Search key is found");
        }else{
            System.out.println("Search key is not found");
        }

       boolean bo = hs.remove(100);
        System.out.println(bo ? "Data Removing is Successful" : "Data Removing is not Successful");
        System.out.println(hs);
    }
}
