import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern18(n); 
        
    }
   //Approach 1
    public static void pattern18(int n) {

        // For loop 'row' in range 0 to N-1.
        for(int row = 0; row < n; row++) {
            
            // For loop 'col' in range 0 to row.
            for(int col = 0; col <= row; col++) {
                
                char currentCharacter = (char)(n - col - 1 + 'A');
                System.out.print(currentCharacter + " ");
            }
           System.out.println();
        }
    }
    // Approach 2
    // public static void pattern18(int n) {
    //     for(int i = 0; i < n; i++) {
    //         for(char ch = (char) ('E' - i); ch <= 'E'; ch++) { //initialize from 'E' and then decrease it to previous character with each next row. e.g E --> D E--> C D E
    //             System.out.print(ch);
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    
}

/*
    Time Complexity : O(N^2)
    Space complexity: O(1)

    Where N is the input integer.
*/

   
