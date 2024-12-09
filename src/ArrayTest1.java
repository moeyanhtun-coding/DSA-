public class ArrayTest1 {
    public static void main(String[] args) {
        // what is the requirements of creating an array?  -> dataType, size
        // Create an array that can store 3 Student names and add student names in array

        /*
            datatype[] arrayName = new dataType[size];
            datatype arrayName[] = new dataType[size];
            dataType[] arrayName;
            dataType[] arrayName = {'',...};  // array initializer
        */

        String[] students = new String[3];
        students[0] = "Moe Pyae Hein";
        students[1] = "Myint Mo Htun Soe Lwin";
        students[2] = "Moe Yan Htun";

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        // Array Operations ?
    }
}
