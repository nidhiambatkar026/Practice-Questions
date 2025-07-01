package Linkelist;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class removeduplicate {
    public static void main(String[] args) {
        LinkedList <Integer> list3 = new LinkedList<>(Arrays.asList(1,2,2,2,3,4,4,4,4,5,8,8,8,8,6,4,3,3,5));
        System.out.println("Before Removing List: "+list3);
       Set<Integer> set = new LinkedHashSet<>(list3);
        list3 = new LinkedList<>(set);
        //A set does not allow duplicate elements.
        //LinkedHashSet is a type of set that remembers the insertion order.
        //so Set removes duplicates from List and stores the result in set.
        list3.clear();
        //this line clears(removes all elements from) the original list
        list3.addAll(set);
        System.out.println("After removing Duplicates: "+list3);
    }
}
