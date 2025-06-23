import java.util.Arrays;

public class TwentyThreeJune {
    public static boolean search(String str, char target){
       if(str.length()==0){
           return false;
       }
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == target){
               return true;
           }
       }
       return false;
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int tot = numbers[left] + numbers[right];
            if (tot == target) {
                return new int[] { left + 1, right + 1 };
            } else if (tot > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
    public static int guessNumber(int n, int guess){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(guess == mid){
                return mid;
            } else if (mid<guess) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        String name = "Vishesh";
        char target = 'e';
        if(search(name, target)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        System.out.println(search(name, target));
        System.out.println(guessNumber(500, 45));
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
