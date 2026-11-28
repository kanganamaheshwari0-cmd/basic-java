
import java.util.Arrays;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            System.out.println(false);
            return;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters of s1
        for (int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        // First window of s2
        for (int i = 0; i < n; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(count1, count2)) {
            System.out.println(true);
            return;
        }

        // Sliding window
        for (int i = n; i < m; i++) {

            // Add new character
            count2[s2.charAt(i) - 'a']++;

            // Remove old character
            count2[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(count1, count2)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
