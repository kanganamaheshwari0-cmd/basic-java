
public class ImageOverlap {
    public static void main(String[] args) {

        int[][] img1 = {
            {1, 1, 0},
            {0, 1, 0},
            {0, 1, 0}
        };

        int[][] img2 = {
            {0, 0, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        int n = img1.length;
        int max = 0;

        for (int row = -n; row < n; row++) {

            for (int col = -n; col < n; col++) {

                int count = 0;

                for (int i = 0; i < n; i++) {

                    for (int j = 0; j < n; j++) {

                        int r = i + row;
                        int c = j + col;

                        if (r >= 0 && r < n &&
                            c >= 0 && c < n) {

                            if (img1[i][j] == 1 &&
                                img2[r][c] == 1) {

                                count++;
                            }
                        }
                    }
                }

                max = Math.max(max, count);
            }
        }

        System.out.println("Maximum Overlap: " + max);
    }
}
