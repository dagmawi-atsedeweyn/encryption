public class Encryption {
    public static String encrypt(String string, int encryptionValue) {
        StringBuilder encryptedText = new StringBuilder(); 
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i); // Get the current character from the string
            int encryptedValue = currentChar + encryptionValue; // Encrypt the character by adding the offset
            encryptedText.append(encryptedValue).append(" "); // Append the encrypted value to the encrypted text, with a space between values
        }
        return encryptedText.toString(); //  return the encrypted text
    }
}
