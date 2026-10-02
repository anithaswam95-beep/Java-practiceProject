package trends.basics;
import java.util.TreeSet;

public class TreeSetClassCastException {

    public static void main(String[] args) {

        TreeSet<Object> data = new TreeSet<>();

        try {

            data.add("Java");
            data.add(25.5f);

        } catch (ClassCastException e) {

            System.out.println("Exception Caught: " + e);
        }
    }
}



