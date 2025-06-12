import java.util.Arrays;

public class TwelveJune {
    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + 1 != 10) {
                ans[i] += 1;
                return ans;
            }
            ans[i] = 0;
        }
        ans[0] = 1;
        return ans;
    }

    public static int maxDiffadjacents(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            int diff = Math.abs(nums[i] - nums[next]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
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
        int[] nums = new int[10];
        int[] arr = {9, 9, 9};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 10;
        }
        int[] Array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(nums));
        System.out.print("the answer of array after adding 1: ");
        System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(maxDiffadjacents(nums));
        int k = removeDuplicates(Array);
        System.out.print("The array after removing duplicates is: [");
        for (int i = 0; i < k; i++) {
            System.out.print(Array[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
