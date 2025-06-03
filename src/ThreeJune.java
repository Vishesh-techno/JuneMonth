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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Enter num: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("the no. of good pair is: " + goodPair(nums));
    }
}
