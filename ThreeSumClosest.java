import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        Arrays.sort(arr);

        int closestSum = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    System.out.println(closestSum);
                    return;
                }
            }
        }

        System.out.println(closestSum);
    }
}
