import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      double area;
      double perimeter;
      double length;
      double width;
      System.out.println("Enter the length ");
      length=sc.nextDouble();
      System.out.println("Enter the width ");
      width=sc.nextDouble();
      area=length*width;
      perimeter=2*(length+width);
      System.out.println("Area : "+area);
        System.out.println("Perimeter : "+perimeter);
    }
}