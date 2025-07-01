import java.util.Scanner;


class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        //step 1: Reverse the entire String
        reverse(chars, 0, n - 1);

        //step 2: Reverse each word
        int Start = 0 ;
        for(int end =0; end < n; end++){
            if(chars[end] == ' '){
               reverse(chars, Start, end-1);
               Start = end+1;
            }
        }
        reverse(chars, Start, n-1);//for last word
        return new String(chars);  
    }

    static void reverse(char[] arr, int i, int j) {
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
    }
}

