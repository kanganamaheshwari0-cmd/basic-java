
public class SortMatrixDiagonally {

    public static void main(String[] args) {

        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int m = mat.length;//matrix me kitni row hai
        int n = mat[0].length;//matrix ki first row me kitne element h

        for (int col = 0; col < n; col++) {

            int[] arr = new int[m];
            int size = 0;

            int i = 0;
            int j = col;

            while (i < m && j < n) {
                arr[size] = mat[i][j];
                size++;
                i++;
                j++;
            }

            // Sorting using simple loops
            for (int a = 0; a < size; a++) {
                for (int b = a + 1; b < size; b++) {

                    if (arr[a] > arr[b]) {

                        int temp = arr[a];
                        arr[a] = arr[b];
                        arr[b] = temp;
                    }
                }
            }

            // Put sorted values back
            i = 0;
            j = col;

            int k = 0;

            while (i < m && j < n) {
                mat[i][j] = arr[k];
                i++;
                j++;
                k++;
            }
        }

        // Print matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
