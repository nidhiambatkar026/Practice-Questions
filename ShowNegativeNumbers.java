import java.util.*;

public class ShowNegativeNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        Collection<Integer> op1 = new ArrayList<>();

        System.out.print("Enter how many numbers you want to input: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            op1.add(num);
        }

        // Use Iterator to print only negative numbers
        Iterator<Integer> it = op1.iterator();

        System.out.println("Negative numbers are:");
        boolean found = false;
        while (it.hasNext()) {
            int val = it.next();
            if (val < 0) {
                System.out.println(val);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No negative numbers were entered.");
        }

        sc.close();
    }
}