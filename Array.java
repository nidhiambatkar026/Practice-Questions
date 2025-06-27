import java.util.*;

public class Array {
    public static void main(String[] args) 
    {
        int i,n;
        String cn;
        Collection c=new ArrayList();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of City");
        n=sc.nextInt();
        System.out.println("\n");
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter"+ i + "city:");
            cn=sc.next();
            c.add(cn);
        }
        System.out.println(" Your City:"+c);
        
    }
}