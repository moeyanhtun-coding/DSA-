import java.util.HashMap;
import java.util.TreeMap;

public class MapTesting {
    public static void main(String[] args) {
//        Map Data Structure = HasMap , TreeMap

//        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(1, "A");
        hm.put(21, "B");
        hm.put(3, "C");
        hm.put(1, "D");

        System.out.println(hm);
        System.out.println(hm.get(1));
        System.out.println(hm.get(20));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.containsKey(30) ? "setKey is Found" : "setKey is not Found");

        if (hm.containsKey(2)) {
            System.out.println("Key is found");
            hm.remove(2);
            System.out.println(hm.get(2));
        } else {
            System.out.println("Key is not found");
        }
    }
}
