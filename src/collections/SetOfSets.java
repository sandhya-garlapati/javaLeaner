package collections;

import java.util.*;

public class SetOfSets {

    public static void main(String[] args){

        HashSet<HashSet<String>> setOfSets = new HashSet<HashSet<String>>();
        HashSet<String> set1 = new HashSet<String>();
        set1.add("sandhya");
        set1.add("ananya");
        set1.add("sravani");
        setOfSets.add(set1);

        HashSet<String> set2 = new HashSet<String>();
        set2.add("gvr");
        set2.add("gmr");
        set2.add("hdsfdsh");
        setOfSets.add(set2);

     System.out.println(setOfSets);

    }
}
