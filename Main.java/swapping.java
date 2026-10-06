import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int temp;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        // Swapping
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}