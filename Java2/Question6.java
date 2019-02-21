//6. WAP showing try, multi-catch and finally blocks.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quotient;
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            quotient  =  num1 / num2;
            System.out.println("Quotient is : "+ quotient);
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Executed Always");
        }

    }
}