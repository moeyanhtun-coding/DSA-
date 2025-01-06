import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Age : ");
            int age = sc.nextInt();
            if (age >= 18 && age <= 100) {
                System.out.println("You are valid age to vote in Election...");
            } else
            {
                throw new AageInvalidException();
            }
        }catch (Exception e) {
            
        }
    }

    public static class AageInvalidException extends RuntimeException{
        @Override
        public String getMessage() {
            return "Please enter a valid age";
        }
    }

}
