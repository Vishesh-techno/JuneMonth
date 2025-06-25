public class TwentyFiveJune {
    public static int arrangeCoins(int n){
        long start = 0;
        long end = n;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(n>=(mid*(mid+1)/2)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)start-1;
    }
    public static char nextGreatestLetterOptimal(char[] letters, char target){
        for (int i = 0; i < letters.length; i++) {
            if(target<=letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        if(target>=letters[end]){
            return letters[0];
        }
        while(start<end){
            int mid = start + (end-start)/2;
            if(letters[mid]<=target){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return letters[end];
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
        char[] lett = {'a','b','z'};
        System.out.println(nextGreatestLetter(lett, 'a'));
        System.out.println(nextGreatestLetterOptimal(lett, 'z'));
    }
}
