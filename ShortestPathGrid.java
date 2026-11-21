
import java.util.*;

public class ShortestPathGrid {

    public static int shortestPath(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = {//4 direction me move kr sakte hai
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };

        boolean[][][] visited = new boolean[m][n][k + 1];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, k, 0});

        visited[0][0][k] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int remainingK = current[2];
            int steps = current[3];

            if (row == m - 1 && col == n - 1) {
                return steps;
            }

            for (int[] dir : directions) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n) {

                    int newK = remainingK - grid[newRow][newCol];

                    if (newK >= 0 &&
                        !visited[newRow][newCol][newK]) {

                        visited[newRow][newCol][newK] = true;

                        queue.offer(new int[]{
                            newRow, newCol, newK, steps + 1
                        });
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {0, 0, 0},
            {1, 1, 0},
            {0, 0, 0}
        };

        int k = 1;

        int result = shortestPath(grid, k);

        System.out.println("Shortest Path: " + result);
    }
}

