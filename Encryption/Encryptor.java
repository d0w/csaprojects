
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
    public String encryptCaesar(int key, String text) {
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
            if (code < 97 || code > 122) {
                cipherText += text.substring(i, i+1);
            }
            else if (code + key > 122) {
                code = code + key - 26;
                cipherText += String.valueOf((char)code);
            }
            else {
                code += key;
                String letter = String.valueOf((char)code);
                cipherText += letter;
            }
        }

        return cipherText;
    }

    public String encryptVigenere(String input, String keyword) {
        String text = "";
        for (int i = 0; i < input.length(); i++) {
            char code = input.charAt(i);
            char key = keyword.charAt(i);            
            int number = (code + key) % 26;
            
            number += 'A';
            text += (char)(number);
        }
        return text;
    }

}

