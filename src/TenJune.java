import java.util.Arrays;

public class TenJune {
    public static int maximumWealth(int[][] accounts) {
        int cs = 0;
        int n = accounts.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            cs = 0;
            for(int j = 0; j<accounts[i].length; j++){
                cs += accounts[i][j];
            }
            max = Math.max(cs, max);
        }
        return max;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int sm = 0;
            for(int j=0; j<n; j++){
                if(nums[i] > nums[j]){
                    sm++;
                }
            }
            ans[i] = sm;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,1,1,2,2,2},{2,2,2,23,3,3}};
        int[] array = {8,1,2,2,3};
        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(accounts));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
    }
}
