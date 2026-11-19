
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 3};

        int i = nums.length - 2;

        // Step 1: Find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find and swap
        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the right side
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
