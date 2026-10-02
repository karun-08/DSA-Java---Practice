import java.util.Scanner;
public class studentdetail {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      double cgpa;
      name = sc.nextLine();
      age = sc.nextInt();
      cgpa = sc.nextDouble();
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("CGPA: " + cgpa);


}
}