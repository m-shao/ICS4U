
public class VigenereCipher {
    public static void run() {
        String key = "SCONA";
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[][] array = createTable(alphabet);
        System.out.printf("%s %12s %s %12s %n", Library.TEXT_BLUE, "", "Vigenere Reference Table", "");
        System.out.print(Library.TEXT_RESET);

        printTable(array, alphabet);

        System.out.println("What is key that you would like to use?");
        key = Library.input.nextLine();
        System.out.println("Would you like to encrypt or decrypt?");
        String modeChoice = Library.input.nextLine();
        if (modeChoice.toLowerCase().startsWith("en")) {
            System.out.println("What is the message you would like to encrypt?");
            String messageInput = Library.input.nextLine();
            System.out.println("Your encrypted message:");
            System.out.println(encrypt(key, messageInput, array, alphabet));
        } else {
            System.out.println("What is the message you would like to decrypt?");
            String messageInput = Library.input.nextLine();
            System.out.println("Your decrypted message:");
            System.out.println(decrypt(key, messageInput, array, alphabet));
        }
    }

    private static char[][] createTable(char[] alphabet) {
        char[][] table = new char[alphabet.length][alphabet.length];
        int a;
        for (int row = 0; row < alphabet.length; row++) {
            for (int col = 0; col < alphabet.length; col++) {
                a = row + col;
                if (a >= alphabet.length) {
                    a = a - alphabet.length;
                }
                table[row][col] = alphabet[a];
            }
        }
        return table;
        // from
        // https://www.daniweb.com/programming/software-development/threads/269840/2d-char-array-vigenere-cipher
    }// createTable

    private static void printTable(char[][] table, char[] alpha) {
        System.out.print("  ");
        for (char letter : alpha) {
            System.out.print(Library.TEXT_RED + letter + " ");
        }
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print(Library.TEXT_RED + alpha[i] + " " + Library.TEXT_RESET);
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }// end printTable

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    public static char getChar(int col, int row, char[][] table) {
        return table[col][row];
    }

    public static String encrypt(String key, String message, char[][] table, char[] alpha) {
        int keyInd = 0;
        String finalString = "";
        for (String letter : message.split("")) {
            finalString += table[findLetterIndex(letter, alpha)][findLetterIndex(String.valueOf(key.charAt(keyInd)),
                    alpha)];
            keyInd++;
            keyInd = keyInd % key.length();

        }
        return finalString;
    }

    public static String decrypt(String key, String message, char[][] table, char[] alpha) {
        int keyInd = 0;
        String finalString = "";
        for (String letter : message.split("")) {
            int keyLetterIndex = findLetterIndex(String.valueOf(key.charAt(keyInd)), alpha);
            for (int i = 0; i < alpha.length; i++) {
                if (table[i][keyLetterIndex] == letter.charAt(0)) {
                    finalString += alpha[i];
                }
            }
            keyInd++;
            keyInd = keyInd % key.length();
        }
        return finalString;
    }

    public static int findLetterIndex(String letter, char[] alpha) {
        for (int i = 0; i < alpha.length; i++) {
            if (String.valueOf(alpha[i]).equalsIgnoreCase(letter)) {
                return i;
            }
        }
        return -1;
    }

}// end class
