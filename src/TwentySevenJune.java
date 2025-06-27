public class TwentySevenJune {
    public static int peakIndexInMountainArray(int[] arr) {
        int maxPeak = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        for (int i = start; i < end; i++) {
            if (maxPeak < arr[i]) {
                maxPeak = arr[i];
                ans = i;
            }
        }
        return ans;
    }

    public static int peakIndexInMountainArrayOptimal(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println("The index of Mountain Peak is: " + peakIndexInMountainArray(arr));
        System.out.println("The index of Mountain Peak is: " + peakIndexInMountainArrayOptimal(arr));
    }
}
