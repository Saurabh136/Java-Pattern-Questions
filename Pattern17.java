import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern17(n);
    }
    public static void pattern17(int n) {
        //spaces
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) { //so if i=2 and n=5 then 5-2-1=2 ,2 spaces
                System.out.print(" ");
            }
            //characters
           char ch = 'A';
           int breakpoint = (2 * i + 1)/2; // i.e after 2 alphabet it will decrease
           for(int j = 1; j <= 2 * i + 1; j++){
            System.out.print(ch);
            //System.out.print(" ");
            if( j <= breakpoint) {
                ch++;
            }else {
                ch--;
            }

           }
            //spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    
}
