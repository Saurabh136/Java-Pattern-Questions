import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern19(n);
        
    }

    public static void pattern19(int n) {

        // Update n with 2*n
        n = 2*n ;

        // For loop 'row' in range 0 to N-1.
        for(int i = 0; i < n; i++) {

            // For loop 'col' in range 0 to N-1.
            for(int j = 0; j < n; j++) {

                // Condition for first half of the rows.
                if(i < n/2 && (i < (n/2 - i) || i >= (n/2 + i))) {
                    System.out.print('*');
                }

                // Condition for the second half of the rows.
                else if(i >= n/2 && (j <= (i-n/2) || j >= (n-i+n/2-1))) {
                    System.out.print('*');
                }

                else {
                    System.out.print(' ');
                }

                System.out.print(' ');
            }

            // End the current row of the pattern.
            System.out.println();
        }


    // public static void pattern19(int n) {
    //     int initspc = 0; //initial space is 0
    //     for(int i = 0; i < n; i++) {
    //         //stars
    //         for(int j = 1; j <= n - i; j++) {
    //             System.out.print("*");
    //         }
    //         //spaces
    //         for(int j = 0; j < initspc; j++) {
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j = 1; j <= n - i; j++) {
    //             System.out.print("*");
    //         }
    //         initspc += 2;
    //         System.out.println();
    //     }
    //     initspc = 2 * n - 2;
    //     for(int i = 1; i < n; i++) {
    //         //stars
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         //spaces
    //         for(int j = 0; j < initspc; j++) {
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         initspc -= 2;
    //         System.out.println();
    //     }

    }
    
}
