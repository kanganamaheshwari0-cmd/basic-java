public class SingleNonDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3,  4, 4};

        int n = nums.length;

        if (n == 1) {
            System.out.println("Single Number: " + nums[0]);
            return;
        }

        int st = 0;
        int end = n - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (mid == 0) {
                if (nums[0] != nums[1]) {
                    System.out.println("Single Number: " + nums[0]);
                    return;
                }
                st = mid + 1;
                continue;
            }

            if (mid == n - 1) {
                if (nums[n - 1] != nums[n - 2]) {
                    System.out.println("Single Number: " + nums[mid]);
                    return;
                }
                end = mid - 1;
                continue;
            }

            if (nums[mid - 1] != nums[mid] &&
                nums[mid] != nums[mid + 1]) {

                System.out.println("Single Number: " + nums[mid]);
                return;
            }

            if (mid % 2 == 0) {

                if (nums[mid - 1] == nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            } else {

                if (nums[mid - 1] == nums[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Single Number not found");
    }
}