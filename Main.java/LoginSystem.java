import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        boolean isActive;

        System.out.print("Enter username: ");
        username = sc.nextLine();

        System.out.print("Enter password: ");
        password = sc.nextLine();

        System.out.print("Is account active? (true/false): ");
        isActive = sc.nextBoolean();

        if (username.equals("admin") && password.equals("1234")) {

            if (isActive) {
                System.out.println("Login successful");
            } else {
                System.out.println("Account is inactive");
            }

        } else {
            System.out.println("Invalid username or password");
        }
    }
}