
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reversed = 0;

        if (number < 0) {
            System.out.println("Not a palindrome");
        } else {
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            if (original == reversed) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }

        sc.close();
    }
}
