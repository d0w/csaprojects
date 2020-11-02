
/**
 * Write a description of class Decryptor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Decryptor
{
    public String decryptor(int key, String text) {
        String cipherText = "";

        for (int i = 0; i < text.length(); i++) {
            int code = (int) text.charAt(i);
            if (code < 97 || code > 122) {
                cipherText += text.substring(i, i+1);
            }
            else if (code - key < 97) {
                code = code - key + 26;
                cipherText += String.valueOf((char)code);
            }
            else {
                code -= key;
                String letter = String.valueOf((char)code);
                cipherText += letter;
            }
        }

        return cipherText;
    }

    public String deVigenere(String input, String keyword) {
        String text = ""; 

        for (int i = 0 ; i < input.length(); i++) 
        { 
            int number = (input.charAt(i) -  keyword.charAt(i) + 26) % 26; 

            // convert into alphabets(ASCII) 
            number += 'A'; 
            text += (char)(number); 
        } 
        return text; 
    }
}
