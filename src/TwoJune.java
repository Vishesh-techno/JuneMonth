import java.util.Arrays;
import java.util.Scanner;

public class TwoJune {
    public static int[] conctenateArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i+n] = arr[i];
        }
        return ans;
    }
//    Running Sum of 1d Array
    public static int[] RunningSum(int[] arr) {
        int cs = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            cs = cs + arr[i];
            arr[i] = cs;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
           nums[i] = i;
        }
        System.out.println("The Concatenated Array is: "+Arrays.toString(conctenateArray(nums)));
        System.out.println("The Running ArraysSum is: "+Arrays.toString(RunningSum(nums)));
    }
}