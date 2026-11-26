
public class ReversePairs {
    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] > 2L * nums[j]) {
                    count++;
                }
            }
        }

        System.out.println("Reverse Pairs: " + count);
    }
}

