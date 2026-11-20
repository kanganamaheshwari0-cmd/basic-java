
import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 4, 3};

        Arrays.sort(nums);

        int perimeter = 0;

        for (int i = nums.length - 1; i >= 2; i--) {

            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];

            if (a + b > c) {

                perimeter = a + b + c;
                break;
            }
        }

        System.out.println(perimeter);
    }
}
