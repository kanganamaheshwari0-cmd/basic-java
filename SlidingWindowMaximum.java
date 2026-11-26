public class SlidingWindowMaximum {
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int n = nums.length;

        int[] result = new int[n - k + 1];//6

        int index = 0;

        for (int i = 0; i <= n - k; i++) {// last window ka startig index find krne ke liye n-k liya hai 
            int max = nums[i];

            for (int j = i; j < i + k; j++) {

                if (nums[j] > max) {
                    max = nums[j];
                }
            }

            result[index++] = max;
        }

        // Print result
        for (int i = 0; i < result.length; i++) {//final result print karta hai
            System.out.print(result[i] + " ");
        }
    }
}
