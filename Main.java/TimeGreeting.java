
import java.util.Scanner;

public class TimeGreeting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hour (0-23): ");
        int hour = sc.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour!");
        } else if (hour >= 5 && hour <= 11) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 17 && hour <= 20) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }

        sc.close();
    }
}

