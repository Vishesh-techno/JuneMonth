import java.util.Arrays;

public class ElevenJune {
    public static int maxSum(int[] arr){
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0 ; i<arr.length; i++){
            cs = cs + arr[i];
        }
        return cs;
    }
    public static int maximum(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length; i++){
           if(arr[i] < min){
               min = arr[i];
           }
           else if(arr[i] > max){
               max = arr[i];
           }
        }
        System.out.println(min+" is minimum from array");
        System.out.println(max+" is maximum from array");
        return max;
    }
    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    ans = new int[]{i,j};
                }
            }
        }
        return ans;
    }
//    public static int bestTimeForSell(int[] arr){
//        int n = arr.length;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//    }
    public static int maximumSum(int[] arr){
        int cs = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            max = Math.max(max, cs);
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        if(max == 0 && maxElement < 0){
            return maxElement;
        }
        return max;
    }

    public static void main(String[] args) {
        int[]  arr = new int[10];
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        for(int i=0;i<arr.length;i++){
            arr[i] = i + 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the sum of all the elements in array is: "+ maxSum(arr));
        System.out.println(maximum(arr));
        System.out.println("the sum of target indexes is: "+ Arrays.toString(twoSum(arr, 9)));
        System.out.println("the maximum sum of sub array is: "+ maximumSum(arr));
        System.out.println("the maximum sum of sub array is: "+ maximumSum(nums));


    }
}
