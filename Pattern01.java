import java.util.Scanner;

class Pattern01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter number: ");
        int n = in.nextInt();
        pattern01(n); 
    }
    public static void pattern01(int n) {

        for(int i = 0; i < n; i++) {     //outer loop printing 4 rows
            for(int j = 0; j < n; j++) {  // inner loop printing 4 stars on each line
                System.out.print("* ");
            }
            System.out.println();  //new line as for loop is completed
        }
    }
}