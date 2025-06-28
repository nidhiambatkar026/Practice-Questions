import java.util.Scanner;

public class rotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the Number of Columbs: ");
        int Columbs = sc.nextInt();

        System.out.println("Enter Matrix: ");
        int Matrix[][] = new int[rows][Columbs];
        for(int i=0; i<rows; i++){
            for(int j=0; j<Columbs; j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<Columbs; j++){
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }
        rotate(Matrix);
    }
    static void rotate(int [][]Matrix){
        
    }
}
