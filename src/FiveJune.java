import java.util.Arrays;
public class FiveJune {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            // Shift elements to right from index[i] to size-1
            for (int j = size; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
            size++;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 5};
        int[] index = {0, 1, 3, 4, 5, 2};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}