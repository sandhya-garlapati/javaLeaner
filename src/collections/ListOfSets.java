package collections;
import java.util.*;

public class ListOfSets {

    public static void main(String[] args) {

        ArrayList<HashSet<Integer>> listOfSets = new ArrayList<HashSet<Integer>>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(4);
        set1.add(5);
        set1.add(6);
        listOfSets.add(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(7);
        set2.add(8);
        set2.add(9);
        listOfSets.add(set2);

        System.out.println(listOfSets);

    }
}
