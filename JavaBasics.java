import java.util.*;

public class JavaBasics {
    public static void hollow_rec(int totrow, int totcol) {
        // Outerloop for row
        for (int i = 1; i <= totrow; i++) {
            // Inner loop for column
            // cell(i,j)
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcol) {
                    //boundary cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void half_inverted_pyramid(int n) {
        //outerloop for rows
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        half_inverted_pyramid(5);
        hollow_rec(4,6);
    }
}