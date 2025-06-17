import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class SeventeenJune {
    public static int[] shuffleArray(int[] nums, int n){
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[n+i];
        }
        return ans;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int n = candies.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if((candies[i]+extraCandies) >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = 2 * i;
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.print("the shuffled array is: ");
        System.out.println(Arrays.toString(shuffleArray(nums, 5)));
        int[] nums1 = shuffleArray(nums, 5);
        System.out.print("the highest candies with kid is shown: ");
        System.out.println(kidsWithCandies(nums1, 5));
    }
}
