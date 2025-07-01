package Linkelist;

import java.util.LinkedList;

public class basic {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Orange");
        list.add("Kiwi");

        System.out.println("Fruits: "+list);
        System.out.println("First Fruits: "+list.getFirst());
        System.out.println("Last Fruit: "+list.getLast());

        for(String fruit: list){
            System.out.print(fruit+ " ");
        }
    }
}
