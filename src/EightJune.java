import java.util.Arrays;

public class EightJune {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i< n-1; i++){
            for(int j= i+1; j<n; j++){
                if(nums[i]  + nums[j] == target){
                    ans = new int[]{i, j};
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("The sum of two numbers indexs is: "+Arrays.toString(twoSum(nums, target)));
    }
}
