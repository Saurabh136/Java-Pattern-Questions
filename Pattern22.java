import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern22(n);

    }
    public static void pattern22(int n) {
        for(int i = 0; i < 2 * n - 1; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                int top_distance = i;
                int left_distance = j;
                int right_distance = (2 * n - 2) - j;
                int down_distance = (2 * n - 2) - i;
                System.out.print((n - min(min(top_distance,down_distance),min(left_distance,right_distance))));
            }
            System.out.println();
        }
    }
}
