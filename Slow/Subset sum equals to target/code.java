class Solution {
    int[][] dp;

    boolean dfs(int[] arr, int idx, int target) {
        // Base cases
        if (target == 0) return true;
        if (idx == arr.length || target < 0) return false;

        // Memo check
        if (dp[idx][target] != -1) {
            return dp[idx][target] == 1;
        }

        // Choices
        boolean take = dfs(arr, idx + 1, target - arr[idx]);
        boolean skip = dfs(arr, idx + 1, target);

        // Store and return
        dp[idx][target] = (take || skip) ? 1 : 0;
        return take || skip;
    }

    public boolean isSubsetSum(int[] arr, int target) {
        dp = new int[arr.length][target + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }
        return dfs(arr, 0, target);
    }
}
