public class Main {
//    https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    public static void main(String[] args) {

        Pattern31(4);
    }
    static void Pattern1(int n){
        for (int row = 1; row <= n; row++) {
//            for every row run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
//            When one row is printed we need to add a new file
            System.out.println();
        }
    }
    static void Pattern2(int n ){
        for (int row = 1; row <= n; row++) {
//            for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
//            When one row is printed we need to add a new file
            System.out.println();
        }
    }
    static void Pattern3(int n ){
        for (int row = 1; row <= n; row++) {
//            for every row run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
//            When one row is printed we need to add a new file
            System.out.println();
        }
    }
    static void Pattern4(int n ){
        for (int row = 1; row <= n; row++) {
//            for every row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
//            When one row is printed we need to add a new file
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int colInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < colInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n){
        for (int row = 1; row <=2 * n; row++) {
            int c = row > n ? 2 * n - row: row;
            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int colInRow = row > n ? 2 * n - row: row;
            int noOfSpaces = n - colInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < colInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern31(int n){
        int original = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atIndex =original - Math.min(Math.min(row , col),Math.min(n-row, n-col)) ;
                System.out.print(atIndex + " ");
            }
            System.out.println();
        }
    }
}