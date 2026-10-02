package trends.basics;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(80);
        numbers.add(30);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println(numbers);

        System.out.println("First: " + numbers.first());

        System.out.println("Last: " + numbers.last());

        System.out.println("Size: " + numbers.size());
    }
}

	
