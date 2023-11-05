public class Decryption {
    public static String decrypt(String encryptedText, int encryptionValue) {
        StringBuilder decryptedText = new StringBuilder(); 
        String[] encryptedValues = encryptedText.split(" "); // Split the encrypted text into an array of individual values

        for (int i = 0; i < encryptedValues.length; i++) { // Iterate over each encrypted value in the array
            int value = Integer.parseInt(encryptedValues[i]); // Convert the encrypted value to an integer
            char decryptedChar = (char) (value - encryptionValue); // Decrypt the character by subtracting the encryption value
            decryptedText.append(decryptedChar); // Append the decrypted character to the StringBuilder
        }

        return decryptedText.toString(); // Return the decrypted text as a String
    }
}
