package collections;

import java.util.*;

// Program to sort array list in descending order

public class SortArrListDescOrder {

    public static void main(String[] args) {

        ArrayList<String>  names = new ArrayList<>();
        names.add("Sandhya");
        names.add("Francis");
        names.add("Ananya");
        Collections.sort(names, Collections.reverseOrder());
        for(String s : names) {
            System.out.println(s);
        }

    }
}
