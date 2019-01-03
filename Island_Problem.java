package Leetcode;

public class Island_Problem {

    void dfs(char[][] grid, int r, int c){

        int nr = grid. length;
        int nc = grid[0].length;

        if(r<0 || c<0 || r>= nr || c>= nc || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        int nr = grid.length;
        int nc = grid[0].length;

        for(int r = 0; r < nr ; r++){
            for(int c = 0; c< nc; c++){
                if(grid[r][c] == '1'){
                    count++;
                    dfs(grid,r,c);
                }
            }
        }
        return count;
    }

    public static void main(String[] arg){
        Island_Problem result = new Island_Problem();
        char[][] test = { {'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','1'} };
        System.out.println(result.numIslands(test));
    }

}
