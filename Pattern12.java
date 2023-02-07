import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern12(n);
        
    }

    public static void pattern12(int n) {
        int spaces = 2 * (n-1); //so spaces for first row if n=4 will be 2x(4-1)= 6. 
        for(int i = 1; i <= n; i++){
            //numbers outer loop
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //spaces
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);   
            }
            System.out.println();
            spaces -= 2;
        }
    }
}
