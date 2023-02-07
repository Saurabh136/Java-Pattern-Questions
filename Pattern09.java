import java.util.Scanner;

public class Pattern09 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter number: ");
        int n = in.nextInt();
        pattern07(n);
        pattern08(n);
    } 
    
    public static void pattern07(int n) {

        for(int i = 0; i < n; i++) {     //outer loop printing rows
            for(int j = 0; j < n-i-1; j++) {  // inner loop printing spaces 
                //System.out.print(i);
                System.out.print(" " );
            }
            for(int j = 0; j < 2 * i + 1; j++) {  // inner loop printing stars
                //System.out.print(i);
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++) {  // inner loop printing spaces 
                //System.out.print(i);
                System.out.print(" ");
            }
           System.out.println();
        }
    }    
    public static void pattern08(int n) {

        for(int i = 0; i < n; i++) {     //outer loop printing rows
            for(int j = 0; j < i; j++) {  // inner loop printing spaces 
                //System.out.print(i);
                System.out.print(" " );
            }
            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {  // inner loop printing stars
                //System.out.print(i);
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {  // inner loop printing spaces 
                //System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();  //new line as for loop is completed
        }
    }
}
