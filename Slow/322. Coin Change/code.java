class Solution {
    int recursion(int[] coins, int amount, int idx, int[][] dp){
        if(amount < 0 || idx == coins.length) return Integer.MAX_VALUE / 2;
        // if(dp[idx][amount] != -1) return dp[idx][amount];
        if(amount == 0) return 0;
        if (dp[idx][amount] != -1) return dp[idx][amount];
        int take = 1 + recursion(coins, amount - coins[idx], idx, dp);
        int skip = recursion(coins, amount, idx + 1, dp);
        // System.out.printf("%d %d %d %d\n", coins[idx], take, skip, amount);
        return dp[idx][amount] = Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for(int i = 0 ; i < coins.length ; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans = recursion(coins, amount, 0, dp);
        // for(int i = 0 ; i < dp.length ; i++){
        //     for(int j = 0 ; j < dp[i].length ; j++){
        //         System.out.printf("%d ", dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }
}


