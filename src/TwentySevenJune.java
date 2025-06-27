public class TwentySevenJune {
    public static int peakIndexInMountainArray(int[] arr) {
        int maxPeak = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
         for(int i=start; i<end; i++){
             if(maxPeak<arr[i]){
                 maxPeak=arr[i];
                 ans = i;
             }
         }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println("The index of Mountain Peak is: " +peakIndexInMountainArray(arr));
    }
}
