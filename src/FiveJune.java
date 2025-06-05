import java.util.*;

public class FiveJune {
    public static int[] createTargetArrayOptimal(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (index[i] >= target.size()) {
                target.add(nums[i]);
            } else {
                target.add(index[i], nums[i]);
            }
        }

        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
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

        System.out.println(Arrays.toString(createTargetArray(nums.clone(), index.clone())));
        System.out.println(Arrays.toString(createTargetArrayOptimal(nums.clone(), index.clone())));
    }
}
