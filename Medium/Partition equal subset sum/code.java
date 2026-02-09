//Normal Recursion

// class Solution {
//     boolean dfs(int arr[], int idx, int sum, int total){
//         if(sum == total) return true;
//         if(idx == arr.length || sum > total){
//             return false;
//         }
//         boolean first = dfs(arr, idx + 1, sum + arr[idx], total - arr[idx]);
//         boolean second = dfs(arr, idx + 1, sum, total);
//         return first || second;
//     }
//     public boolean equalPartition(int n, int[] arr) {
//         int total = 0;
//         for(int num : arr){
//             total += num;
//         }
//         return dfs(arr, 0, 0, total);
//     }
// }

//Using 2DP
class Solution {
    int dp[][];
    boolean dfs(int arr[], int idx, int sum, int total, int[][] dp){
        if(sum == total) return true;
        if(idx == arr.length || sum > total){
            return false;
        }
        if(dp[idx][total] != -1){
            return dp[idx][total] == 1;
        }
        boolean first = dfs(arr, idx + 1, sum + arr[idx], total - arr[idx], dp);
        boolean second = dfs(arr, idx + 1, sum, total, dp);
        dp[idx][total] = (first || second) ? 1 : 0;
        return first || second;
    }
    public boolean equalPartition(int n, int[] arr) {
        int total = 0;
        for(int num : arr){
            total += num;
        }
        dp = new int[n][total + 1];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= total ; j++){
                dp[i][j] = -1;
            }
        }
        return dfs(arr, 0, 0, total, dp);
    }
}
