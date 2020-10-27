
/**
 * Encrypts a message given
 *
 * @author Derek Xu
 * @version 10/23/2020
 */
public class Encryptor
{
    public Encryptor() {

    }

    /**
     * Encrypts a message according to Ceasar Cipher
     * 
     * @param key a number from -25 to 25 used to encrypt
     * @param the text that needs to be encrypted
     * 
     * @returns the encrypted message
     */
    public String encryptCeasar(int key, String text) {
        /*Loop through every letter
         * Convert each letter to number code
         * Add key to the number code
         * convert bck to letter
         * add to cipherText
         * 
         */
        String cipherText = "";

        for (int i = 0; i < text.length(); i++) {
            int code = (int) text.charAt(i);
            code += key;
            cipherText = code + String.valueOf(code);
            
        }

        return cipherText;
    }
}
