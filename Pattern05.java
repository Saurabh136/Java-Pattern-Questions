import java.util.Scanner;

public class Pattern05 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter number: ");
        int n = in.nextInt();
        pattern05(n); 
    }
    public static void pattern05(int n) {

        for(int i = 1; i <= n; i++) {     //outer loop printing 4 rows
            for(int j = 0; j < n-i+1; j++) {  // inner loop printing 4 stars on each line
                //System.out.print(i);
                System.out.print("* ");
            }
            System.out.println();  //new line as for loop is completed
        }
    }
    
}
