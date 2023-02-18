package MD.com;
//LC 136
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,3};
        System.out.println(solution(arr));
    }

    static int solution(int[] array) {
        int n = 0 ;
        for (int i = 0; i < array.length; i++) {
            n = n ^ array[i];
        }
        return n;
    }
}
