class Solution {

    // int recursion(int n, int k, int target, int sum) {
    //     if (sum > target)
    //         return 0;

    //     if (n == 0)
    //         return sum == target ? 1 : 0;

    //     int ret = 0; 

    //     for (int i = 1; i <= k; i++) {
    //         ret += recursion(n - 1, k, target, sum + i);
    //     }

    //     return ret;
    // }

    int recursion(int n, int k, int target, int sum, int[][] dp) {
        if (sum > target) {
            return 0;
        }
        if (n == 0) {
            return sum == target ? 1 : 0;
        }
        if (dp[n][sum] != -1)
            return dp[n][sum];
        int ret = 0;
        for (int i = 1; i <= k; i++) {
            ret = ret + recursion(n - 1, k, target, sum + i, dp);
            ret %= 1000000007;
        }
        return dp[n][sum] = ret;
    }

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return recursion(n, k, target, 0, dp);
    }
}
