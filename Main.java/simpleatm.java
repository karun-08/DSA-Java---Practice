import java.util.Scanner;

public class simpleatm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        double withdrawal;

        System.out.print("Enter withdrawal amount: ");
        withdrawal = sc.nextDouble();

        if (withdrawal <= 0) {
            System.out.println("Invalid amount");
        }
        else if (withdrawal <= balance) {
            balance = balance - withdrawal;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}