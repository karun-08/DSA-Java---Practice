import java.util.Scanner;

public class salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double basicSalary;
        double hra;
        double da;
        double grossSalary;

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);
    }
}