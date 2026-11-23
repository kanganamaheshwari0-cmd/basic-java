
import java.util.*;

public class FourSum {

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    for (int l = k + 1; l < n; l++) {

                        int sum = nums[i] + nums[j]
                                + nums[k] + nums[l];

                        if (sum == target) {

                            result.add(Arrays.asList(
                                nums[i], nums[j],
                                nums[k], nums[l]
                            ));
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}

