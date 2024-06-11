import java.util.ArrayList;

public class PrimeNumberChecker {
    /**
     * Checks if a number is prime. 
     * Uses a basic sieve technique, dynamic programming, and memoization. 
     * It limits the use of modulo which is moderately expensive. 
     * To reduce complexity, it does not check for factors beyond the squareroot of the input. 
     * @param number Number to check if it is prime
     * @return If the input is prime
     */
    public static Boolean isPrime(int number){
        
        Boolean isPrime = false; 
        Boolean skipMod = false;
        Boolean skipNextFactor = false; 
        ArrayList<Integer> notFactors = new ArrayList<Integer>();

        //There are no primes less than 2
        if(number < 2){
            isPrime = false;
            skipNextFactor = true;
        }else if(number == 2){//Edge case two is prime
            isPrime = true;
            skipNextFactor = true; 
        }

        //Check every possible factor
        int i = 2;
        while(skipNextFactor == false && i < (Math.sqrt(number) + 1)){
            //Skip modulo for multiples of non-factors
            skipMod = false;
            for(int j = 0; j < notFactors.size(); j++){
                if(i%notFactors.get(j)==0){
                    skipMod = true;
                    break;    
                }
            }

            //Check if there is a new factor
            if(skipMod == false){
                if(number%i != 0){
                    notFactors.add(i);
                }
                //If there is a new factor it cannot be prime
                if(number%i == 0){
                    skipNextFactor = true;
                    isPrime = false;
                }
            }
            i++; 
        }

        //If the end of the while loop is reached all possible factors have been tried
        if(skipNextFactor == false){
            isPrime = true; 
        }

        return isPrime; 
    }
}
