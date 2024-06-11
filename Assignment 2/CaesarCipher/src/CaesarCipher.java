public class CaesarCipher {
    /**
     * Encrypts a string with the Caesar Cipher method. 
     * Ciphers all characters that are ACII letters.
     * Leaves the rest of the characters as they are. 
     * All ACII characters can be used as input.
     * 
     * @param plainText The input text to be ciphered
     * @param shift The number of letters to shift
     * @return The encrypted string
     */
    public static String encrypt(String plainText, int shift){
        StringBuilder encrypted = new StringBuilder("");
        for(int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);
            //is lowercase
            if(minLower <= c && c <= maxLower){
                //convert back to zero based index
                int alphIndex = c - minLower;  
                //mod to get new index
                encrypted.append((char) (minLower + Math.floorMod(alphIndex + shift,26)));
            }
            //is uppercase
            else if(minUpper <= c && c <= maxUpper){
                //convert back to zero based index
                int alphIndex = c - minUpper;  
                //mod to get new index
                encrypted.append((char) (minUpper + Math.floorMod(alphIndex + shift,26)));
            }
            else{
                //I assume letters can only be upper or lower case
                assert Character.isLetter(c) == false; 
                encrypted.append(c);
            }
        }
        return encrypted.toString(); 
    }

    private final static int minLower = 'a';
    private final static int maxLower = 'z';
    private final static int minUpper = 'A';
    private final static int maxUpper = 'Z';
    
}
