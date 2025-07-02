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
        //Creates a new node using the node class constructor.
        if(head == null){
          //if the list is empty(head==null)set the new node as the head of the list
          head = newNode;
        }
        else{
          //if list is not empty, start from the head node
          Node_563 current = head;
          //traverse the list until you find the last node(who's next is null).
          while(current.next!=null){
            current= current.next;
            //attach the new node to the end of the list
          }
          current.next = newNode;
          //by updating the next pointer of the last node.
        }
    }
    //print the list(LinkedList)
    void printList(){
         Node_563 current=head;
         //starts at the head of the list

         while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
         }
         //traverse each node and prints its data
         //move to the next node using , current = current.next;
         //stops when it reaches a node that points to null.
    }
}

public class detail {
    public static void main(String[] args) {
        LinkedList_563 list = new LinkedList_563();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(80);
        list.add(90);

        System.out.println("Linked List");
        list.printList();
    }
}
