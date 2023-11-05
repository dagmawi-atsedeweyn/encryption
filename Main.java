import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to encrypt or decrypt the text? (e/d): ");
        String choice = scanner.next();

        if (choice.equals("e")) {
            System.out.print("Enter string: ");
            String string = scanner.nextLine();
            string = scanner.nextLine();

            System.out.print("Enter the offset: ");
            int encryptionValue = scanner.nextInt();

            Encryption encryption = new Encryption();
            String encryptedText = encryption.encrypt(string, encryptionValue);
            System.out.println("Encrypted text: " + encryptedText);
        } else if (choice.equals("d")) {
            System.out.print("Enter encrypted text: ");
            String encryptedText = scanner.nextLine();
            encryptedText = scanner.nextLine();

            System.out.print("Enter the offset: ");
            int encryptionValue = scanner.nextInt();

            Decryption decryption = new Decryption();
            String decryptedText = decryption.decrypt(encryptedText, encryptionValue);
            System.out.println("Decrypted text: " + decryptedText);
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
