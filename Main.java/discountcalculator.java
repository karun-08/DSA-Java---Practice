import java.util.Scanner;
public class discountcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        double discount;
        double finalPrice;
        double discountAmount;
         System.out.print("Enter the price of the item: ");
        price = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discount = sc.nextDouble();
        discountAmount = price * (discount / 100);
        finalPrice = price - discountAmount;
        System.out.println("The discount amount is: " + discountAmount);
        System.out.println("The final price after discount is: " + finalPrice); 
    }
}