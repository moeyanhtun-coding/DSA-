import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListDs {
    public static void main(String[] args) {
//        ArrayList myList = new ArrayList();  // child Type
//        List myList1 = new ArrayList(); // parent Type -> if use parent type, you can use every build in method than child type
//        myList.add("Honey");
//        myList.add("Moe Yan");
//        myList.add(10);
//        myList.add(false);
//        Object value = myList.get(3);
//
//        System.out.println("Here are the list of myList " + myList);
//        System.out.println("The value is ".concat(value.toString()));
//
//
//        ArrayList<Integer> myList2 = new ArrayList();
//        myList2.add(10);
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(10);
//        System.out.println(myList2);
//
//        Integer value2 = myList2.get(1);
//        System.out.println(value2);
//
////        Search Data
//        System.out.println("Data Search: ");
//        boolean result = myList2.contains(60); // contains search each index of the list
//        int result1 = myList2.lastIndexOf(10);
//        System.out.println(result == true ? "Data founded" : "No data found");
//        System.out.println(result1 >= 0 ? result1 : "Data not found");
//
//        System.out.println("Remove Method Testing: ");

        ArrayList<String> myList3 = new ArrayList();
        myList3.add("Honey");
        myList3.add("Moe Yan");
        myList3.add("Kaung Kaung");
        System.out.println(myList3.remove("Moe Yan") ? "Deleted successful" : "Deleted Fail");
        System.out.println( myList3.size());
    }

}
