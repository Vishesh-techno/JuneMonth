import java.util.Arrays;

public class TwentyNineJune {
    public static int[] firstAndLast(int[] nums, int target){
        int[] res = {-1, -1};
        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums, target, false);
        res[0] = start;
        res[1] = end;
        return res;
    }
    public static int binarySearch(int[] nums, int target, boolean isSearchingLeft){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                index = mid;
                if(isSearchingLeft){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLast(nums, target)));

    }
}
