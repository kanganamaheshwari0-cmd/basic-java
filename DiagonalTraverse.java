
public class DiagonalTraverse {
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];

        int row = 0;
        int col = 0;
        int index = 0;

        boolean up = true;

        while (index < m * n) {

            result[index] = mat[row][col];
            index++;

            if (up) {

                if (col == n - 1) {
                    row++;
                    up = false;
                }
                else if (row == 0) {
                    col++;
                    up = false;
                }
                else {
                    row--;
                    col++;
                }

            } else {

                if (row == m - 1) {
                    col++;
                    up = true;
                }
                else if (col == 0) {
                    row++;
                    up = true;
                }
                else {
                    row++;
                    col--;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
