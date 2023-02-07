import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern13(n);
        
    }

    public static void pattern13(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) { // outer loop
            for(int j=1; j<= i; j++) { // inner loop printing same coloumn as the row number
                System.out.print(num);
                System.out.print(" ");
                num = num + 1; // increase the number by 1 on each row
            }
            System.out.println();
        }
    }
    
}
