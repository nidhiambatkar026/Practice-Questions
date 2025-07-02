//create a custom LinkedList(Manually)
package Linkelist;

import java.util.LinkedList;

class Node_563{
    //Represent one element of the LinkedList.
    int data;//stores the value of node
    Node_563 next;//stores the reference to the next node in the list initially it's null
     Node_563(int data){
        this.data = data;//sets the node's data
        this.next = null;
        //ensures it doesn't point to any other node initially.
     }
}

class LinkedList_563{
    //Declares the class with head node that marks the start of the List.

    //head is initially null(i.e list is empty).
    Node_563 head;
    void add(int data){
        Node_563 newNode = new Node_563(data);
    }
}

public class detail {
    public static void main(String[] args) {
        LinkedList_563 list = new LinkedList_563();
        list.add(10);
        list.add(30);
        list.add(50);
    }
}
