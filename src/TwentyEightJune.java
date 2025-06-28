import java.util.*;
public class TwentyEightJune {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        for (i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        for (i = 0; i < len1; i++) {
            for (j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[k++] = nums2[j];
                    nums2[j] = -1;
                    break;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < ans.length; i++) {
            if (list.contains(ans[i])) {
                continue;
            } else {
                if (ans[i] != -1) {
                    list.add(ans[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(end<0){
            return -1;
        }
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {2,1,2,4,3};
        int[] nums2 = {9,7,2,1,8,9};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(search(nums1, 4));
    }
}
