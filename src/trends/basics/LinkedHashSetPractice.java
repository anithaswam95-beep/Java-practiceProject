package trends.basics;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red");

        System.out.println(set);

        set.remove("Green");

        System.out.println(set);

        System.out.println("Size: " + set.size());
    }
}

	


