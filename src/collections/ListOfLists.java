package collections;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListOfLists {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        listOfLists.add(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        listOfLists.add(list2);

        for(int i=0; i<listOfLists.size(); i++){
            for(int j=0; j<listOfLists.get(i).size(); j++){
                System.out.print(listOfLists.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
