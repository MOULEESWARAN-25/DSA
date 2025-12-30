class Solution {
    int recursion(int[][] grid, int i, int j, int[][] dp) {
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE / 2;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }
        int right = grid[i][j] + recursion(grid, i, j + 1, dp);
        // System.out.printf("right : %d %d %d\n", i, j, right);
        int down = grid[i][j] + recursion(grid, i + 1, j, dp);
        // System.out.printf("down : %d %d %d\n", i, j, down);
        return dp[i][j] = Math.min(right, down);
    }

    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++){
            Arrays.fill(dp[i], -1);
        }
        int ans = recursion(grid, 0, 0, dp);
        // for(int i = 0 ; i < grid.length ; i++){
        //     for(int j = 0 ; j < grid[i].length ; j++){
        //         System.out.printf("%d ", dp[i][j]);
        //     }
        //     System.out.println();
        // }
        return ans;
    }
}
