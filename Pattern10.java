import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        pattern10(n);
        
    }

    public static void pattern10(int n) {
        for(int i = 1; i <= 2 * n - 1; i++) {  //outer loop with condition (2n -1)
            int stars = i;
            if(i > n) {
                stars = 2 * n - i;    // if i > n then (2n - i) decreasing the stars after symmetry
            }
            for(int j = 1; j <= stars; j++){  //inner loop printing stars which are equal to i
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    
}
