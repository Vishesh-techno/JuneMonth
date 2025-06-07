public class SevenJune {
    public static int oddCells(int n, int m, int[][] indices){
        int[][] ans = new int[n][m];
        int count = 0;
        for(int i=0; i<indices.length; i++){
            for(int j=0; j<m; j++){
                ans[indices[i][0]][j]++;
            }
            for(int j=0; j<n; j++){
                ans[j][indices[i][1]]++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static int findNum(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(String.valueOf(arr[i]).length() % 2 == 0 ){
                ans++;
            }
        }
        return ans;
    }
    public static int findNum2(int[] arr){
        int ans = 0;
        for(int num : arr){
            int count = 0;
            while(num > 0){
                num /= 10;
                count++;
            }
            if(count % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]  nums = {2,5,48,9,7,6,52,55225,4,5,2,456,321,165,4321,32,1,3};
        int[][] indices = {{0,1},{1,1}};
        int n = 2, m = 3;
        int res = oddCells(n, m, indices);
        System.out.println(res);
        System.out.println(findNum(nums));
        System.out.println(findNum2(nums));

    }
}
