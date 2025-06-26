public class TwentySixJune {
    public static int ceilNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid]< target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (arr[mid]< target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 62;
        System.out.println("The length of array is: "+arr.length);
        System.out.println("The index of ceiling number is: "+ceilNumber(arr, target));
        System.out.println("The index of floor number is: "+floorNumber(arr, target));
    }
}
