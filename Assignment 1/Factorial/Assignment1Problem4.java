public class Assignment1Problem4{  
    /**
     * Returns the factorial of an integer input value.
     * Uses the recursive implementation.  
     * @author Riley Poole
     * @param n The input value.
     * @return The factorial. 
     * @throws RuntimeException If return exceeds maximum integer value. Returns overflow error.
     */
    public static int Factorial(int n){
        if(n < 0){ //negative values can cause stack overflow
            throw new RuntimeException("Possible negative input value.");
        }
        if(n == 0) return 1; //base case
        else{ //recursive case
            int ret = n * Factorial(--n);
            if(n >= 32){
                throw new RuntimeException("Possible overflow error. Return may exceed maximum integer value.");
            }
            return ret; 
        }
    }
}