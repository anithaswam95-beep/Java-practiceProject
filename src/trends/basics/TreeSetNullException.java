package trends.basics;
import java.util.TreeSet;

public class TreeSetNullException {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        try {

            names.add("John");
            names.add("David");
            names.add(null);

        } catch (NullPointerException e) {

            System.out.println("Exception Caught: " + e);
        }
    }
}
