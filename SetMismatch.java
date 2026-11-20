
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int n = nums.length;

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = i;
            }

            if (count == 0) {
                missing = i;
            }
        }

        System.out.println(Arrays.toString(
            new int[]{duplicate, missing}
        ));
    }
}

