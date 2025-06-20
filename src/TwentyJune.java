import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class TwentyJune {
    public static List<Integer> addToArray(int[] nums, int k) {
        int i = nums.length - 1;
        List<Integer> ans = new ArrayList<>();
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                ans.add((nums[i] + k) % 10);
                k = (nums[i] + k) / 10;
            } else {
                ans.add(k % 10);
                k = k / 10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();
        System.out.println(addToArray(num, k));

    }
}
