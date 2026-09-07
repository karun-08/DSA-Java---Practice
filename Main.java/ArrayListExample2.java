import java.util.ArrayList; 
public class ArrayListExample2 {
    public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

numbers.clear();

System.out.println(numbers.size());
System.out.println(numbers.isEmpty());
    }
}
