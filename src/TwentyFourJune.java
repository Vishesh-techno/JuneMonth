import java.util.*;

public class TwentyFourJune {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int r = 0; // unjudged minimum index
        int n = nums.length;
        for (int j = 0; j < n; ++j) {
            if (nums[j] == key) {
                int l = Math.max(r, j - k);
                r = Math.min(n - 1, j + k) + 1;
                for (int i = l; i < r; ++i) {
                    res.add(i);
                }
            }
        }
        return res;
    }

    public static boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        if (num == 1) {
            return true;
        }
        while (start < end) {
            if (num == (int) (start * start)) {
                return true;
                // break;
            } else {
                start++;
            }
        }
        return false;
    }
    public static boolean isPerfectSquareOptimal(int num){
        long start = 2;
        long end = num/2;
        if(num<2){
            return true;
        }
        while(start<=end){
            long mid = start + (end-start)/2;
            long square = mid*mid;
            if(square==num){
                return true;
            } else if (square<num) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        System.out.println(findKDistantIndices(nums, 9, 1));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquareOptimal(100000001));
    }
}
