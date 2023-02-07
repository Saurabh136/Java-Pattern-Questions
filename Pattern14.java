import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern14(n);
        
    }

    public static void pattern14(int n) {
        for(int i = 0; i < n; i++) { // outer loop
            for(char ch = 'A'; ch <= 'A' + i; ch++) { // inner loop printing same col as rows but the next character is printed on every col
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}

    

