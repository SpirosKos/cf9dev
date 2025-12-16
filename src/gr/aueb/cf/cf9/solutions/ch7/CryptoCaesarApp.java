package gr.aueb.cf.cf9.solutions.ch7;

/**
 * Caesar cipher program
 *
 * @author g0ld3
 * @version 1.0
 */

public class CryptoCaesarApp {
    public static void main(String[] args) {

        //Declaration
        final int KEY = 3;

        //Test string for cipher
        String s = "BUZZ";

        //Results and printing
        String encrypted = cryptCaesar(s,KEY);
        System.out.println(encrypted);
        String decrypt = decryptCaesar(encrypted,KEY);
        System.out.println(decrypt);

    }

    /**
     * Encryption   method
     * @param s     string
     * @param key   encrypted key
     * @return      encrypted string
     */
    public static String cryptCaesar(String s, int key){
        StringBuilder sb =  new StringBuilder();
        for (int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            char temp = cipher(c,key);
            sb.append(temp);
        }
        return sb.toString();
    }

    /**
     * Decryption method
     * @param encrypted encrypted string
     * @param key       decryption key
     * @return          decrypted string
     */
    public static String decryptCaesar(String encrypted,int key){
        StringBuilder sb =  new StringBuilder();
        for (int i = 0;i < encrypted.length(); i++){
            char c = encrypted.charAt(i);
            char temp =  decipher(c,key);

            sb.append(temp);
        }
        return sb.toString();
    }

    /**
     * Cipher method
     * @param c     char to encrypt
     * @param key   encryption key
     * @return      encrypted char
     */
    public static char cipher(char c,int key){
        if (!Character.isAlphabetic(c)) return c;
        char base = Character.isUpperCase(c) ? 'A' :'a';
        return (char)((((c - base)+key) % 26)+base);
    }

    /**
     * Decipher method
     * @param c     char to decrypt
     * @param key   decryption key
     * @return      decrypted char
     */
    public static char decipher(char c,int key){
        if (!Character.isAlphabetic(c)) return c;
        char base = Character.isUpperCase(c) ? 'A' :'a';
        int letters = 26;
        return (char)((((c - base)-key+letters) % letters)+base);
    }
}
