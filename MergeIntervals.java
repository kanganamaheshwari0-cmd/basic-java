import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        // Step 1: Sort intervals
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: First interval add karo
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Remaining intervals check karo
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } 
            else {
                result.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Last interval add karo
        result.add(new int[]{start, end});

        // Print result
        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}
