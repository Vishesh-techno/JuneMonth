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
    public static void main(String[] args) {
        int[]  arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = i + 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the "+ maxSum(arr));

    }
}
