
public class CountInversions {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};

        int n = arr.length;
        long count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Count of Inversions: " + count);
    }
}
