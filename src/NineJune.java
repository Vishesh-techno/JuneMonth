import java.util.Arrays;

public class NineJune {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ans = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        ans[0] = 1;
        return ans;
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {9, 9, 9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(removeDuplicates(nums));
    }
}
