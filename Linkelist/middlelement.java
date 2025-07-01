package Linkelist;

import java.util.Arrays;
import java.util.LinkedList;

public class middlelement {
    public static void main(String[] args) {
        LinkedList <Integer> List1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int middlelement = List1.size()/2;
        System.out.println("Middle Element: "+List1.get(middlelement));

    }
}
