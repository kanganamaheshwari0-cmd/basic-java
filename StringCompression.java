
public class StringCompression {
    public static void main(String[] args) {

        char[] chars = {
            'a', 'a', 'b', 'b', 'c', 'c', 'c'
        };

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length &&
                   chars[i] == current) {
                count++;
                i++;
            }

            chars[index] = current;
            index++;

            if (count > 1) {
                String number = String.valueOf(count);

                for (int j = 0; j < number.length(); j++) {
                    chars[index] = number.charAt(j);
                    index++;
                }
            }
        }

        System.out.println("Compressed length: " + index);

        for (int k = 0; k < index; k++) {
            System.out.print(chars[k] + " ");
        }
    }
}
