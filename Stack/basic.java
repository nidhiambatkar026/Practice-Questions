//implement a stack using java's build in function
package Stack;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        System.out.println("Is Empty: "+s.isEmpty()); 
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Stack Data: "+s);
        System.out.println("Top Data: "+s.peek());
        System.out.println("Popped Data: "+s.pop());
        System.out.println("Stack Data: "+s);
        System.out.println("Is empty: "+s.isEmpty());
    }
}
