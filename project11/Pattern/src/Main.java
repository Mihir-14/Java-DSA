public class Main {
//    https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    public static void main(String[] args) {

        Pattern5(5);
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
}