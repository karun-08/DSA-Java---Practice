import java.util.Scanner;

public class average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double mark1;
        double mark2;
        double mark3;
        double average;

        System.out.print("Enter mark 1: ");
        mark1 = sc.nextDouble();

        System.out.print("Enter mark 2: ");
        mark2 = sc.nextDouble();

        System.out.print("Enter mark 3: ");
        mark3 = sc.nextDouble();

        average = (mark1 + mark2 + mark3) / 3;

        System.out.println("Average: " + average);
    }
}