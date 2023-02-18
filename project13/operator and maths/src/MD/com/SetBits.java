package MD.com;

public class SetBits {
    public static void main(String[] args) {
        int n= 69;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbits(n));
    }

    public static int setbits(int n) {
        int count =0;
        while (n > 0){
            count++;
//            n = n-(n&-n); or we can approach as
            n = n & (n-1);
        }
        return count;
    }
}
