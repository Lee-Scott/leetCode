package numOfIslands;

class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;

        if(grid.length == 0 || grid == null){
            return numOfIslands;
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                if(grid[i][j] == '1'){
                    numOfIslands =+ subSearch(grid, i, j);
                }
            }
        }

        return numOfIslands;

    }

    public int subSearch(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] = '0';
        subSearch(grid, i + 1, j);//  up
        subSearch(grid, i, j + 1);// down
        subSearch(grid, i -1, j); // left
        subSearch(grid, i, j + 1);// right

        return 1;

    }
}