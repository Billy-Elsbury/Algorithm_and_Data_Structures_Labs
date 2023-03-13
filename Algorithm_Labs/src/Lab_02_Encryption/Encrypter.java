package Lab_02_Encryption;

public class Encrypter {

    public static String encryptRowColumn(String plaintext, int numColumns) {
        // Remove spaces from plaintext and convert to uppercase
        plaintext = plaintext.replaceAll("\\s", "").toUpperCase();
        // Calculate number of rows required for plaintext
        int numRows = (int) Math.ceil((double) plaintext.length() / numColumns);
        // Pad plaintext with Xs if necessary
        plaintext = String.format("%-" + numRows * numColumns + "s", plaintext).replace(' ', 'X');

        StringBuilder ciphertext = new StringBuilder();
        for (int col = 0; col < numColumns; col++) {
            int index = col;
            for (int row = 0; row < numRows; row++) {
                ciphertext.append(plaintext.charAt(index));
                index += numColumns;
            }
        }
        return ciphertext.toString();
    }

    public static String decryptRowColumn(String ciphertext, int numColumns) {
        // To decrypt, swap numColumns and numRows
        int numRows = (int) Math.ceil((double) ciphertext.length() / numColumns);
        StringBuilder plaintext = new StringBuilder();
        int index = 0;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                if (index < ciphertext.length()) {
                    plaintext.append(ciphertext.charAt(index));
                    index += numRows;
                }
            }
            index = row + 1;
        }
        return plaintext.toString();
    }

    public static String encryptCaesarCipher(String plaintext, int shift) {
        // Convert plaintext to uppercase
        plaintext = plaintext.toUpperCase();
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (ch != ' ') {
                // Apply shift to character
                ch = (char) ((ch - 'A' + shift) % 26 + 'A');
            }
            ciphertext.append(ch);
        }
        return ciphertext.toString();
    }
}

