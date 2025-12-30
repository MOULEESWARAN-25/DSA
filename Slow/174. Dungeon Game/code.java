class Solution {
    int min = Integer.MAX_VALUE;

    void recursion(int[][] dungeon, int path, int i, int j, int check) {
        if (i >= dungeon.length || j >= dungeon[0].length)
            return;
        if (dungeon[i][j] > 0) {
            if (path <= 0) {
                check = check + (-1 * path) + 1;
                path = 1;
            }
        }
        path += dungeon[i][j];
        if (i == dungeon.length - 1 && j == dungeon[0].length - 1) {
            if (path <= 0) {
                check = check + (-1 * path) + 1;
            }
            // System.out.println(check);
            // min = Math.min(min, path);
            min = Math.min(min, check);
            // System.out.printf("%d %d %d %d\n", i, j, path, check);
        }
        recursion(dungeon, path, i + 1, j, check);
        recursion(dungeon, path, i, j + 1, check);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        recursion(dungeon, 0, 0, 0, 0);
        return min == Integer.MAX_VALUE ? 1 : min;
    }
}
