
public class SumEvenAfterQueries {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[][] queries = {
            {1, 0},
            {-3, 1},
            {-4, 0},
            {2, 3}
        };

        int sum = 0;

        // Calculate initial even sum
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int val = queries[i][0];
            int index = queries[i][1];

            // Remove old value if even
            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }

            // Add new value
            nums[index] += val;

            // Add new value if even
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }

            answer[i] = sum;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

