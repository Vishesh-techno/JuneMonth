import java.util.Arrays;
import java.util.Scanner;

public class ThreeJune {
    public static int goodPair(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums){
        int n = nums.length;
        int [] small = new int [n];
        for(int i=0; i<n; i++){
            int sm = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i]){
                    sm++;
                }
                small[i] = sm;
            }
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Enter num: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("the no. of good pair is: " + goodPair(nums));
        System.out.println("the smallest number is: " + Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
