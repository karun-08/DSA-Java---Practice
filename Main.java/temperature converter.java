import java.util.Scanner;

public class temperature Converter { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}