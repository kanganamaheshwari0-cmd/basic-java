
public class FindDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {

                    System.out.println("Duplicate: " + nums[i]);
                    return;
                }
            }
        }
    }
}
