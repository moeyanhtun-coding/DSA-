import javax.management.RuntimeMBeanException;
import java.util.Scanner;

public class ExceptionTest3 {

    static int totalMarks = 0;
    static int averageMarks = 0;
    static Scanner sc = new Scanner(System.in);
    static int[] marks = new int[4];

    public static void main(String[] args) {
        try {
            MainFunction();
        } catch (RuntimeException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    static void MainFunction() {
        for (int i = 0; i < marks.length; i++)
            AskMarks(i);
        for (int i = 0; i < marks.length; i++)
            System.out.println("Unit - " + (i + 1) + " Mark is : " + marks[i]);
        int avgMarks = AverageMarks();
        System.out.println("Average Marks is : " + avgMarks);
    }

    static void AskMarks(int i) {
        while (true) {
            try {
                System.out.println("Enter Unit " + (i + 1) + " Mark - ");
                String input = sc.next();
                int unitMark = Integer.parseInt(input);

                if (unitMark <= 0 || unitMark > 100) {
                    throw new RuntimeException("Invalid Unit Mark. You Should Enter a Valid Mark (1-100)!");
                }

                marks[i] = unitMark;
                break;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input! Please enter a number between 1 and 100. Not String!");
                sc.nextLine();
            } catch (RuntimeException e) {
                System.err.println("Error: " + e.getMessage());

            }
        }
    }

    static int AverageMarks() {
        for (int j = 0; j < marks.length; j++) {
            totalMarks = totalMarks + marks[j];
            averageMarks = totalMarks / marks.length;
        }
        return averageMarks;
    }

}
