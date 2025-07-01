package Linkelist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class reverselist {
    public static void main(String[] args) {
        //Reverse the LinkedList
        LinkedList <Integer> List1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        //Arrays.asList(....) creates a fixed list of integers
        Collections.reverse(List1);
        System.out.println("Reversed List: "+List1);
    }
}
