package trends.basics;
import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorExample {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ListIterator<String> listItr = colors.listIterator();

       
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        
    }
}

       