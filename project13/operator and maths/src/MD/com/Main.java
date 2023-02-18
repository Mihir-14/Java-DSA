package MD.com;

public class Main {
    public static void main(String[] args) {
        int n =690;
        System.out.println(isodd(n));
    }

    static boolean isodd(int n) {
        return (n & 1) == 1;
    }
}