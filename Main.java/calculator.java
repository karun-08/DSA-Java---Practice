import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Remainder: " + (number1 % number2));
    }
}