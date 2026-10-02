package trends.basics;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("David");
        names.add("Mary");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}



