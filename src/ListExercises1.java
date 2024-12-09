import java.util.ArrayList;
import java.util.Scanner;

public class ListExercises1
{
    public static void main(String[] args) {
        ArrayList<Student> stdList = new ArrayList();
        Student std1 = new Student();
        std1.id = "HND53001";
        std1.name = "Moe Moe";
        std1.batch = "HND-53";
        Student std2 = new Student("ID53001", "Moe Yan", "HND-53");

        stdList.add(std2);
        stdList.add(std1);

        for (int i = 0; i < stdList.size(); i++) {
            System.out.println("Student ID : " + stdList.get(i).id);
            System.out.println("Student Name : " + stdList.get(i).name);
            System.out.println("Student Batch : " + stdList.get(i).batch);
            System.out.println("-------------------------------");
        }

        for (Student std : stdList){
            System.out.println("Student ID : " + std.id);
            System.out.println("Student Name : " + std.name);
            System.out.println("Student Batch : " + std.batch);
            System.out.println("-------------------------------");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        for(int i = 0; i < stdList.size(); i++){
            if(stdList.get(i).name.equals(name)){
                System.out.println("Your Student Founded");
                System.out.println("Are you sure want to delete (y/n) :");
                char rm = sc.next().charAt(0);
                if(rm == 'y'){
                    stdList.remove(i);
                    System.out.println("Student Removed");
                }
                return;
            }
        }



    }

}
