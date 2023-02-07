import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern15(n);
            
    }
    
    public static void pattern15(int n) {
        for(int i = 0; i < n; i++) { // outer loop
            for(char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) { // A + (n - row - 1) for eg: A + (5 - 0 - 1) = A B C D E
                System.out.print(ch);
                System.out.print(" ");
            }
                System.out.println();
        }
    }
}    
        
    
    
        
    
        

