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
        //print Rotated Matrix
        System.out.println("Rotated Matrix: ");
        for(int[] row :Matrix){
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    static void rotate(int [][]Matrix){
        int n=Matrix.length;
       
        //Transpose the matrix
        for(int i=0;i<n;i++){
            //swap elements at (i,j) & (j,i)
            for(int j=1;j<n;j++){
               int temp = Matrix[i][j];
               Matrix[i][j] = Matrix[j][i];
               Matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int Start = 0;
            int End = n-1;

            while(Start < End){
                int temp = Matrix[i][Start];
                Matrix[i][Start] = Matrix[i][End];
                Matrix[i][End] = temp;
                Start++;
                End--;
            }
        }
    }
}
