import java.util.Arrays;

public class TwoStack {
    public static void main(String[] args) {

    }
    static int twostack(int x , int[] a , int[] b){
        return twostack(x ,a ,b ,0 ,0) - 1;
    }

    private static int twostack(int x , int[] a , int[] b , int sum , int count){
        if(sum > x){
            return count;
        }
        if(a.length == 0 ||b.length == 0){
            return count;
        }
        int ans1 = twostack(x, Arrays.copyOfRange(a ,1 ,a.length) , b ,sum+a[0] , count+1);
        int ans2 = twostack(x, a , Arrays.copyOfRange(b ,1 ,b.length) ,sum+a[0] , count+1);

        return Math.max(ans1 , ans2);
    }
}
