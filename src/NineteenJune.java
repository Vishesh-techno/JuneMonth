import java.util.*;
public class NineteenJune {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[list.size()];
        for(int i=0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
