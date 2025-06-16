import java.util.Arrays;

public class SixteenJune {
    public static int[] permutation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i=0; i<n; i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(permutation(nums)));
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
