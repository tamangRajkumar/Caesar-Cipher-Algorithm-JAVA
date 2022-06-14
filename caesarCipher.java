import java.lang.reflect.Array;
import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = sc.nextLine().toLowerCase();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        encrypt(message, key);

    }

    public static void encrypt(String message, int key) {
        char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    // LinkedList<Character> shiftedAlphabet = new LinkedList<>();
    // char shiftedAlphabet [] = {};
                     

        for (int i = 0; i < message.length(); i++) {
            char eachCharacter = message.charAt(i);

            // System.out.println(eachCharacter);
            // System.out.println(alphabet[1]);

            for (int j = 0; j < alphabet.length; j++) {
                char checkAlphabet = alphabet[j];
                if (checkAlphabet == eachCharacter) {
                    int shiftedAlphabetIndexValue = (j + key) % 26;
                    char newShiftedAlphabet = alphabet[(shiftedAlphabetIndexValue)];
                    // shiftedAlphabet.push(newShiftedAlphabet);
                    System.out.print(newShiftedAlphabet);
                }
            }
            // System.out.println(newShiftedAlphabet);

        }
           // Decrypt the cipher message
        // Scanner sc = new Scanner(System.in);
        // System.out.println("In order to decrypt the message please enter 'y' to decrypt and 'n' to exit");
        // int keyToDecrypt= sc.nextInt();
        // decrypt()

    }

    // public static void encrypt(String message, int key) {
    //     char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
    //             's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    //     for (int i = 0; i < message.length(); i++) {
    //         char eachCharacter = message.charAt(i);

            // System.out.println(eachCharacter);
            // System.out.println(alphabet[1]);

    //         for (int j = 0; j < alphabet.length; j++) {
    //             char checkAlphabet = alphabet[j];
    //             if (checkAlphabet == eachCharacter) {
    //                 int shiftedAlphabetIndexValue = (j + key) % 26;
    //                 char newShiftedAlphabet = alphabet[(shiftedAlphabetIndexValue)];
    //                 System.out.print(newShiftedAlphabet);
    //             }
    //         }

    //     }
    // }

}
