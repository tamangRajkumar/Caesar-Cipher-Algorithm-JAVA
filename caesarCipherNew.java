
import java.util.*;

public class caesarCipherNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = sc.nextLine().toLowerCase();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int lengthOfMessage = message.length();
        encrypt(message, key, lengthOfMessage);

    }

    public static void encrypt(String message, int key, int lengthOfMessage) {
        char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        LinkedList<Character> shiftedAlphabet = new LinkedList<>();
        // char shiftedAlphabet [] = {};

        for (int i = 0; i < lengthOfMessage; i++) {
            char eachCharacter = message.charAt(i);
            // System.out.println(eachCharacter);
            // System.out.println(alphabet[1]);

            for (int j = 0; j < alphabet.length; j++) {
                char checkAlphabet = alphabet[j];
                if (checkAlphabet == eachCharacter) {
                    int shiftedAlphabetIndexValue = (j + key) % 26;
                    char newShiftedAlphabet = alphabet[(shiftedAlphabetIndexValue)];
                    shiftedAlphabet.add(newShiftedAlphabet);
                    System.out.print(newShiftedAlphabet);
                }
            }
            // System.out.println(shiftedAlphabet);

        }
        // Decrypt the cipher message
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "In order to decrypt the message please enter 'y' to decrypt and 'n' to exit");
        String input = sc.nextLine();

        if (input.equals("y")) {
            Scanner newKey = new Scanner(System.in);
            System.out.println("\n" + "In order to decrypt Please Enter key");
            int keyToDecrypt = newKey.nextInt();
            if (keyToDecrypt == key) {
                decrypt(shiftedAlphabet, keyToDecrypt, lengthOfMessage);

            }

        } else {
            System.out.println("Please try again");
        }

    }

    public static void decrypt(LinkedList<Character> shiftedAlphabet, int keyToDecrypt, int lengthOfMessage) {
        char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        for (int i = 0; i < lengthOfMessage; i++) {
            // char eachCharacter = message.charAt(i);

            char getAlphabet = shiftedAlphabet.get(i);

            // System.out.print(getAlphabet);
            // System.out.println(alphabet[1]);

            for (int j = 0; j < alphabet.length; j++) {
                char checkAlphabet = alphabet[j];
                if (checkAlphabet == getAlphabet) {
                    int reverseShiftedAlphabet = (j - keyToDecrypt) % 26;
                    char newShiftedAlphabet = alphabet[reverseShiftedAlphabet];
                    System.out.print(newShiftedAlphabet);
                }
            }

        }
    }

}
