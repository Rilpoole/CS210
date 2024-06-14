public class Factorial {
    public static int calculate(int n) {
        int ret = -1;

        // Input checking
        if (n < 0) {
            ret = -1;
        }

        // Rerusive base case
        else if (n == 0 || n == 1) {
            ret = 1;
        }

        // Recursive step case
        else {
            ret = n * Factorial.calculate(--n);
        }
        return ret;
    }
}
