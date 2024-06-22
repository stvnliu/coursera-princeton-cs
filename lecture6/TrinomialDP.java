public class TrinomialDP {
    public static long trinomial(int n, int k) {
        long[][] memo = new long[n+2][n+2];
        memo[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    // is the start
                    memo[i][j] = memo[i-1][j] + memo[i-1][j+1] + memo[i-1][j+1]; 
                }
                else {
                    memo[i][j] = memo[i-1][j-1] + memo[i-1][j] + memo[i-1][j+1];
                }
            }
        }
        return memo[n][k];
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
