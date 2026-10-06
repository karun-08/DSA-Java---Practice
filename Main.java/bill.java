import java.util.Scanner;

public class bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double itemPrice;
        int quantity;
        double totalBill;

        System.out.print("Enter item price: ");
        itemPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        totalBill = itemPrice * quantity;

        System.out.println("Total bill: " + totalBill);
    }
}