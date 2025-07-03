package Linkelist;
import java.util.*;
class Node_566{
int data;
Node_566 next;   //0A reference to the next node in the list
    Node_566(int data)
    {
        this.data=data;
    }       //constructor that sets the data when a new node is created.
}
public class LinkedList{
    public static void main(String[] args) {
        Node_566 head=new Node_566(1);

        head.next = new Node_566(2);
        head.next.next = new Node_566(3);
        head.next.next.next = new Node_566(4);
        head.next.next.next.next = new Node_566(5);

        //create a cycle:
        //node 5 points back to node 2.
        head.next.next.next.next.next = head.next;

        //Detect and remove the cycle

        //calls detectcycle() to findnthe cycle
        //and remove the cycle
        //stores the result (true/false) in hasCycle.
        boolean hasCycle  = detectcycle(head);

        System.out.println("Cycle is Detected and Removed "+hasCycle);
        printCycle(head);
}
     static boolean detectcycle(Node_566 head) {
    Node_566 slow = head;
    Node_566 fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            // If they meet, a cycle is detected
            removeCycle(head, slow);
            return true;
        }
    }
    return false;  
}

static void removeCycle(Node_566 head, Node_566 meetingPoint){
    //start a pointer from the head, and use the meeting point from the cycle
     Node_566 start = head;

     //move the pointer one step at a time until their .next references matched.
     //This identifies the node just before the start of the cycle.
     while(start.next!=meetingPoint.next){
         start = start.next;
         meetingPoint = meetingPoint.next;
     }
     meetingPoint.next = null;
     //break the cycle by setting the .next of the last node of cycle
}
static void printCycle(Node_566 head){
    Node_566 current = head;
    //starts at the head of the list.

    //traverse the list,
    //printing each node's data.

    while(current!=null){
       System.out.println(current.data+" ");
       current=current.next;
    }
}
}