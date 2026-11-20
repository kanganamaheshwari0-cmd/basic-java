
public class IncreasingTriplet {
    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 0, 4, 6};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= first) {
                first = nums[i];
            }
            else if (nums[i] <= second) {
                second = nums[i];
            }
            else {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}

