import java.util.Arrays;

public class TwelveJune {
    public static int[] plusOne(int[] arr){
        int n = arr.length;
        int[] ans = new int[n+1];
        for(int i=n-1; i>=0; i--){
            if(arr[i] + 1 != 10){
                ans[i] += 1;
                return ans;
            }
            ans[i] = 0;
        }
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] arr = {9,9,9};
        for(int i = 0; i<nums.length; i++){
            nums[i] = i + 10;
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("the answer of array after adding 1: ");
        System.out.println(Arrays.toString(plusOne(arr)));

    }
}
