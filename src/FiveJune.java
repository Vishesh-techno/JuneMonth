import java.util.Arrays;
public class FiveJune {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int m = index.length;
        int[] target = new int[n];
        for(int i = 0; i<n; i++){
            if(index[i] == i){
                target[index[i]] = nums[i];
            }else{
                for(int j=index[i]; j<i+1; j++){
                    int temp = target[j];
                    target[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return target;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,5};
        int[] index = {0,1,3,4,5,2};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
