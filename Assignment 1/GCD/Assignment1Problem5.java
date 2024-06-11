public class Assignment1Problem5 {
    /**
     * This method finds the greatest common divisor (GCF) using the Euclidean method. 
     * @param a First input into Euclidian algorithm. Input value 1 to MaxInt
     * @param b Second input into Euclidian algorithm. Input value 1 to MaxInt
     * @return The greatest common divisor. 
     */
    public static int GCD(int a, int b){
        int remainder = 1; 
        int ret = 0; 

        //Check inputs for sanity
        if(a < 0 || b < 0){
            throw new RuntimeException("Negative input value");
        }
        if(a == 0 || b == 0){
            throw new RuntimeException("Zero input value.");
        }
        if(a > Integer.MAX_VALUE || b > Integer.MAX_VALUE){
            throw new RuntimeException("Overflow warning. Input value greater than MaxInt");
        }

        while(remainder > 0){
            remainder = a % b; 
            a = b;
            if(remainder == 0) ret = b;
            else b = remainder;  
        }

        return ret; 

    }
}
