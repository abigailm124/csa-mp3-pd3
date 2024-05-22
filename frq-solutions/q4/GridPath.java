import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  public Location getNextLoc(int row, int col){
      if(row == grid.length-1){
        return new Location(row, col+1);
      } else if (col == grid[0].length-1){
        return new Location(row+1, col);
      } else if (grid[row][col+1] < grid[row+1][col]){
        return new Location(row, col+1);
      } else {
        return new Location(row+1, col);
      }

    }

    public int sumPath(int row, int col){
      int sum = grid[row][col];
      while(row != grid.length-1 || col != grid[0].length -1){
        Location l2 = getNextLoc(row, col);
        row = l2.getRow();
        col = l2.getCol();
        sum += grid[row][col];
      }
      return sum;
  }
  
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
