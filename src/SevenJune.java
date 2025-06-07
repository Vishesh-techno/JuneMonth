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
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int n = 2, m = 3;
        int res = oddCells(n, m, indices);
        System.out.println(res);

    }
}
