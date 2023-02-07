import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern11(n);

        
    }
    public static void pattern11(int n) {
        int start = 1;
        for(int i = 0; i < n; i++) {  //outer loop
            if(i % 2 == 0){   //print 0 on even number row
                start = 1;
            }else {
                start = 0;
            }
            for(int j = 0; j < i; j++ ) {  //inner loop
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    
}
