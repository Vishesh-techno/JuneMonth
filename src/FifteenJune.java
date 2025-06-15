import java.util.Arrays;

public class FifteenJune {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int[] runningSum(int[] nums) {
        int cs = 0;
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            ans[i] = cs;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
