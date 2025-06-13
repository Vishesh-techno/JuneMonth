import java.util.Arrays;

public class ThirteenJune {
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i=0; i<nums.length; i++){
            nums[i] = i + 11;
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        rotate(nums, 5);
        System.out.println(Arrays.toString(rotate(nums, 5 )));
    }
}
