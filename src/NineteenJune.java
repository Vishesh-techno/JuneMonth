import java.util.*;
public class NineteenJune {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int i = n-1;
        List<Integer> ans = new ArrayList<>();
        while(i>=0||k>0){
            if(i >= 0){
                ans.add((num[i] + k )%10);
                k = (num[i] + k)/10;
            }else{
                ans.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
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
        System.out.println(addToArrayForm(nums, 5));
    }
}
