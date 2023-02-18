package MD.com;

public class RangXOR {
    public static void main(String[] args) {
//        1st approach that will help us to reduce the time complexity
//        xor of a till b = xor b ^ xor(a-1)
        int a = 3;
        int b= 9;
        int ans =  xor(b) ^ xor(a-1);
        System.out.println(ans);
//        2ND approach but this will  give the time limit exceed for large numbers
        int ans2=0;
        for (int i = a; i <= b; i++) {
            ans2 = ans2 ^ i;
        }
        System.out.println(ans2);
    }
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a+1;
        }
        return 0;
    }
}
