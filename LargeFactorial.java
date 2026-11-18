
public class LargeFactorial {
    public static void main(String[] args) {

        int n = 5;

        int[] arr = new int[1000];

        arr[0] = 1;
        int size = 1;

        for (int i = 2; i <= n; i++) {

            int carry = 0;

            for (int j = 0; j < size; j++) {

                int num = arr[j] * i + carry;

                arr[j] = num % 10;
                carry = num / 10;
            }

            while (carry > 0) {
                arr[size] = carry % 10;
                carry = carry / 10;
                size++;
            }
        }

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
