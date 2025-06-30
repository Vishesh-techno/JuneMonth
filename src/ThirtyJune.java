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
    public static int singleElementOptimal(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-2];
        int start = 1;
        int end = nums.length-2;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]!= nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }else if((mid%2==1) && nums[mid] == nums[mid-1] || (mid%2==0)&& nums[mid] == nums[mid+1]){
             start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
        System.out.println(findSingleElement(nums));
        System.out.println(singleElementOptimal(nums));
    }
}
