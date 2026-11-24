public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;

        // First loop: Prefix product
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;

        // Second loop: Suffix product
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        // Print result
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
