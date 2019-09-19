package collections;
import java.util.*;

//program to convert list to array

public class ListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        Integer[] array = list.toArray(new Integer[list.size()]);

        for(Integer i : array) {
            System.out.println(i);
        }

    }
}
