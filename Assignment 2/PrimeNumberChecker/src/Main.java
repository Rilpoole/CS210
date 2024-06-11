import java.util.Scanner;

public class Main {
    /**
     * Provides application entry point for Assignment 2 Coding 2 Part B.
     * Takes integer inputs while until empty line is returned and prints if the input is prime.
     * @param args
     */
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        while(scr.hasNextLine()){
            int number = Integer.parseInt(scr.nextLine());
            if(PrimeNumberChecker.isPrime(number) == true){
                System.out.println("Prime");
            }else if(PrimeNumberChecker.isPrime(number) == false){
                System.out.println("Not Prime");
            }
            else{
                //I assume a number is either prime or not prime
                assert (PrimeNumberChecker.isPrime(number) ^ PrimeNumberChecker.isPrime(number)) == true;
            }
        }
        scr.close();
    }
}
