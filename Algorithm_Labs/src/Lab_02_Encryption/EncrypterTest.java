package Lab_02_Encryption;

public class EncrypterTest {
    public static void main(String[] args) {
        // Test Row/Column Transposition encryption

        String plaintext = "HELLO WORLD";
        int numColumns = 3;

        System.out.println("Plain Text: " + plaintext);

        String encryptedText = Encrypter.encryptRowColumn(plaintext, numColumns);
        System.out.println("Encrypted Text: " + encryptedText);
        String decryptedText = Encrypter.decryptRowColumn(encryptedText, numColumns);
        System.out.println("Decrypted Text: " + decryptedText);

        // Test Caesar Cipher encryption
        plaintext = "HELLO WORLD";
        int shift = 3;

        System.out.println("\nPlain Text: " + plaintext);

        encryptedText = Encrypter.encryptCaesarCipher(plaintext, shift);
        System.out.println("Encrypted Text: " + encryptedText);
        decryptedText = Encrypter.encryptCaesarCipher(encryptedText, 26 - shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
