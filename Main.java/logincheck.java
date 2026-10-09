import java.util.Scanner;

public class logincheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        String password;

        System.out.print("Enter username: ");
        username = sc.nextLine();

        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}