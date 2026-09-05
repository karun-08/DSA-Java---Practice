import java.util.ArrayList; 
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(20);

numbers.remove(Integer.valueOf(20));

System.out.println(numbers);
System.out.println(numbers.size());
System.out.println(numbers.indexOf(20));
    }
}