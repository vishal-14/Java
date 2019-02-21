//7. WAP to convert seconds into days, hours, minutes and seconds.
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int days = seconds / (24 * 3600);

        seconds = seconds % (24 * 3600);
        int hours = seconds / 3600;

        seconds %= 3600;
        int minutes = seconds / 60 ;

        seconds %= 60;
        int second = seconds;

        System.out.println(""+days+" Days, "+hours+" Hours, "+minutes+" Minutes, "+second+" Seconds");

    }
}