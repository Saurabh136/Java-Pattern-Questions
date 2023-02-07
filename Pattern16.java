import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern16(n);
    }
    public static void pattern16(int n) {
        for(int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}