
public class PowXN {

    public static void main(String[] args) {

        double x = 2.00000;
        int n = 10;

        long power = n;

        if (power < 0) {
            x = 1.0 / x;
            power = -power;
        }

        double ans = 1.0;

        while (power > 0) {

            if ((power & 1) == 1) {
                ans = ans * x;
            }

            x = x * x;
            power = power >> 1;
        }

        System.out.println("Answer: " + ans);
    }
}
