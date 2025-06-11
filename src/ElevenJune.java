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

    public static void main(String[] args) {
        int[]  arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = i + 1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the sum of all the elements in array is: "+ maxSum(arr));
        System.out.println(maximum(arr));


    }
}
