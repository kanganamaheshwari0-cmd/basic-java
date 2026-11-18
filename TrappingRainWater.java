
public class TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {3, 0, 2, 0, 4};

        int total = 0;

        for (int i = 0; i < height.length; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j <= i; j++) {
                if (height[j] > left) {
                    left = height[j];
                }
            }

            for (int j = i; j < height.length; j++) {
                if (height[j] > right) {
                    right = height[j];
                }
            }

            int water = Math.min(left, right) - height[i];

            total = total + water;
        }

        System.out.println("Total Water: " + total);
    }
}

