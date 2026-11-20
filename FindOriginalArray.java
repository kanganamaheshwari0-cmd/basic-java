
import java.util.Arrays;

public class FindOriginalArray {
    public static void main(String[] args) {

        int[] changed = {1, 3, 4, 2, 6, 8};

        int n = changed.length;

        if (n % 2 != 0) {
            System.out.println("Invalid Array");
            return;
        }

        Arrays.sort(changed);

        int[] original = new int[n / 2];

        int index = 0;

        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (used[i]) {
                continue;
            }

            boolean found = false;

            for (int j = i + 1; j < n; j++) {

                if (!used[j] && changed[j] == changed[i] * 2) {

                    original[index] = changed[i];
                    index++;

                    used[i] = true;
                    used[j] = true;

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid Array");
                return;
            }
        }

        System.out.println(Arrays.toString(original));
    }
}
