package Playfair;

import java.util.HashSet;
import java.util.Set;

public class PlayFairCipher {
    private char[][] keyMatrix;
    private static final int MATRIX_SIZE = 5;

    private char[][] generateKeyMatrix(String key) {
        char[][] keyMatrix = new char[MATRIX_SIZE][MATRIX_SIZE];
        Set<Character> keySet = new HashSet<>();
        StringBuilder keyBuilder = new StringBuilder();
        for (char ch : key.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                if (ch == 'J') {
                    ch = 'I';
                }
                if (!keySet.contains(ch)) {
                    keyBuilder.append(ch);
                    keySet.add(ch);
                }
            }
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'J') continue;
            if (!keySet.contains(ch)) {
                keyBuilder.append(ch);
                keySet.add(ch);
            }
        }
        int index = 0;
        for (int row = 0; row < MATRIX_SIZE; row++) {
            for (int col = 0; col < MATRIX_SIZE; col++) {
                keyMatrix[row][col] = keyBuilder.charAt(index++);
            }
        }

        return keyMatrix;
    }

    private String preprocessText(String text, boolean encode) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < sb.length() - 1; i += 2) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.insert(i + 1, 'X');
            }
        }
        if (sb.length() % 2 != 0) {
            sb.append('X');
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        return processText(text, true);
    }

    public String decrypt(String cipherText) {
        return processText(cipherText, false);
    }

    public int[] findPosition(char ch) {
        for (int row = 0; row < MATRIX_SIZE; row++) {
            for (int col = 0; col < MATRIX_SIZE; col++) {
                if (keyMatrix[row][col] == ch) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    private String processText(String text, boolean encrypt) {
        text = preprocessText(text, encrypt);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(a);
            int[] posB = findPosition(b);
            if (posA[0] == posB[0]) {
                result.append(keyMatrix[posA[0]][(posA[1] + (encrypt ? 1 : 4)) % MATRIX_SIZE]);
                result.append(keyMatrix[posB[0]][(posB[1] + (encrypt ? 1 : 4)) % MATRIX_SIZE]);
            }

            else if (posA[1] == posB[1]) {
                result.append(keyMatrix[(posA[0] + (encrypt ? 1 : 4)) % MATRIX_SIZE][posA[1]]);
                result.append(keyMatrix[(posB[0] + (encrypt ? 1 : 4)) % MATRIX_SIZE][posB[1]]);
            }

            else {
                result.append(keyMatrix[posA[0]][posB[1]]);
                result.append(keyMatrix[posB[0]][posA[1]]);
            }
        }

        return result.toString();
    }

    public PlayFairCipher(String key) {
        keyMatrix = generateKeyMatrix(key);
    }

    public String getMatrixAsString() {
        StringBuilder matrixString = new StringBuilder();
        for (int row = 0; row < MATRIX_SIZE; row++) {
            for (int col = 0; col < MATRIX_SIZE; col++) {
                matrixString.append(keyMatrix[row][col]).append(" ");
            }
            matrixString.append("\n");
        }
        return matrixString.toString();
    }

 
}
