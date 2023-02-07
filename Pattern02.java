import java.util.Scanner;

public class Pattern02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter number: ");
        int n = in.nextInt();
        pattern02(n); 
    }
    public static void pattern02(int n) {

        for(int i = 0; i < n; i++) {     //outer loop printing 4 rows
            for(int j = 0; j <= i; j++) {  // inner loop printing 4 stars on each line
                System.out.print("* ");
            }
            System.out.println();  //new line as for loop is completed
        }
    }
    
}
