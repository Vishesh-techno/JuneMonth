public class TenJune {
    public static int maximumWealth(int[][] accounts) {
        int cs = 0;
        int n = accounts.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            cs = 0;
            for(int j = 0; j<accounts[i].length; j++){
                cs += accounts[i][j];
            }
            max = Math.max(cs, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,1,1,2,2,2},{2,2,2,23,3,3}};
        System.out.println(maximumWealth(accounts));
    }
}
