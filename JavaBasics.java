import java.util.*;

public class  JavaBasics {
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

    public static void half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_tringle(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i =1; i<=n; i++){
            //stars i
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd phase inverted image
        for(int i=n; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }

        public static void solid_rombus(int n){
        for(int i = 1; i<=n; i++){
            //for empty space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        public static void diamond(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for 2nd half
            for(int i = n; i>=1; i--){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void hollow_rhombus(int n){
        for(int i = 1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                if(j==1 || i==1 || j==n || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {
        // for calling any funtion from the main funtion please uncomment the funtion and its run automatically
//        half_inverted_pyramid(5);
//        hollow_rec(4,6);
////        half_pyramid(5);
//        floyd_triangle(5);
//        zero_one_tringle(5);
//        butterfly(5);
//        solid_rombus(7);
//        hollow_rhombus(5);
//        diamond(4);
    }
}