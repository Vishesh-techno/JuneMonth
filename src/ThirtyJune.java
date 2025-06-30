public class ThirtyJune {
    public static int findSingleElement(int[] nums){
        int n =  nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }else if(i==n-1){
                if(nums[i] != nums[i-1]){
                    return nums[i];
                }
            }else{
                if(nums[i] != nums[i-1]&&nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
        System.out.println(findSingleElement(nums));
    }
}
