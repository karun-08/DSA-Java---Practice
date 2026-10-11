
import java.util.Scanner;

public class LargestoftwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("Largest number: " + number1);
        } else if (number2 > number1) {
            System.out.println("Largest number: " + number2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}   