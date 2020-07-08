package ByteDance.Array;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        /*因为在dfs()中会修改grid，所以为了不改变输入，复制一份copy，在copy中操作*/
        int[][] copy = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, grid[0].length);
        }

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, copy));
                }
            }
        }
        return res;
    }

    public static int dfs(int i, int j, int[][] grid) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length||grid[i][j] == 0){
            return 0;
        }
        else {
            grid[i][j] = 0;
            int count = 1;
            count += dfs(i - 1, j, grid);
            count += dfs(i + 1, j, grid);
            count += dfs(i, j - 1, grid);
            count += dfs(i, j + 1, grid);
            return count;
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        System.out.println(MaxAreaOfIsland.maxAreaOfIsland(a));
    }
}
