package MD.com;
import java.util.ArrayList;
public class FindXORSumofAllPairsBitwiseAND {
    public static void main(String[] args) {
        int[] num1 ={1033,4179,1931,8117,7364,7737,6219,3439,1537,7993};
        int[] num2 ={6386};
        int ans = getXORSum(num1 , num2);
        System.out.println(ans);
    }
    public static int getXORSum(int[] arr1, int[] arr2) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                a.add(arr1[i] & arr2[j]);
            }
        }
        int b = 0;
        for(int k = 0 ; k < a.size() ; k++){
            b = b ^ a.get(k);
        }
        return b;
    }
}
