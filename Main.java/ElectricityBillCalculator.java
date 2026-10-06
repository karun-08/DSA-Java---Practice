import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double units;
        double costPerUnit;
        double totalBill;

        System.out.print("Enter units consumed: ");
        units = sc.nextDouble();

        System.out.print("Enter cost per unit: ");
        costPerUnit = sc.nextDouble();

        totalBill = units * costPerUnit;

        System.out.println("Total electricity bill: " + totalBill);
    }
}