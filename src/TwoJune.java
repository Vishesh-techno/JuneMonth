import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public static int maxWealth(int[][] arr) {
        int cs = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            cs = 0;
            for(int j = 0; j<arr[i].length; j++){
                cs = cs + arr[i][j];
            }
            max = Math.max(max, cs);
        }
        return max;
    }
    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if (candies[i]>max){
                max = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int i =0; i<n; i++){
            if((candies[i] += extraCandies) >= max){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] twodim = new int[3][3];
        for (int i = 0; i < twodim.length; i++) {
          for (int j = 0; j < twodim[i].length; j++) {
              twodim[i][j] = sc.nextInt();
          }
        }
        for (int i = 0; i < twodim.length; i++) {
            System.out.println(Arrays.toString(twodim[i]));
        }
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
           nums[i] = i;
        }
        System.out.println("The Concatenated Array is: "+Arrays.toString(conctenateArray(nums)));
        System.out.println("The Running ArraysSum is: "+Arrays.toString(RunningSum(nums)));
        System.out.println("The Max Wealth is: "+maxWealth(twodim));
        System.out.println(KidsWithCandies(nums, 3));
    }
}