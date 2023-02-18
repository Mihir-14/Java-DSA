package MD.com;
//lc 137
public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr ={2,2,3,2};
        System.out.println(solution(arr));
    }
    static public int solution(int[] nums){
        int count= 0 ,ans;
        for(int i = 0 ; i < nums.length ; i++){
            count = count + nums[i];
        }
        ans = count % 3;
        return ans;
    }
}
