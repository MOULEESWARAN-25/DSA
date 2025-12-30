class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i <= cost.length; i++) {
            dp[i]  = i == cost.length ? Math.min(dp[i - 2], dp[i - 1]) : Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        // for (int i = 0; i <= cost.length; i++) {
        //     System.out.printf("%d ", dp[i]);
        // }
        return dp[cost.length];
    }
}
