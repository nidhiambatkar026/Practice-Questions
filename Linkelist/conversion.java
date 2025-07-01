package Linkelist;

import java.util.Arrays;
import java.util.LinkedList;

public class conversion {
    public static void main(String[] args) {
        LinkedList<String> list4 =  new LinkedList<>(Arrays.asList("A", "B","C","D","E","F"));
        String[] arr = list4.toArray(new String[0]);
        System.out.println("Array Elements: ");
        for(String s: arr){
            System.out.println(s+ " ");
        }
    }
}
