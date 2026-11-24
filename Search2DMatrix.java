
public class Search2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target) {

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}

