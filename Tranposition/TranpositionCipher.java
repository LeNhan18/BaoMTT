package Tranposition;

import java.util.Arrays;

public class TranpositionCipher {

    public String encrypt(String text, int[] key) {
        int n = (int) Math.ceil((double) text.length() / key.length);
        char[][] grid = new char[n][key.length];

        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }

      
        for (int i = 0; i < text.length(); i++) {
            grid[i / key.length][i % key.length] = text.charAt(i);
        }

        StringBuilder ciphertext = new StringBuilder();
        for (int k : key) {
            for (int row = 0; row < n; row++) {
                if (grid[row][k - 1] != ' ') { 
                    ciphertext.append(grid[row][k - 1]);
                }
            }
        }
        return ciphertext.toString();
    }

    public String decrypt(String text, int[] key) {
        int n = (int) Math.ceil((double) text.length() / key.length);
        char[][] grid = new char[n][key.length];

        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }


        int textIndex = 0;
        for (int k : key) {
            for (int row = 0; row < n; row++) {
                if (textIndex < text.length()) {
                    grid[row][k - 1] = text.charAt(textIndex++);
                }
            }
        }

        StringBuilder plaintext = new StringBuilder();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < key.length; col++) {
                if (grid[row][col] != ' ') { 
                    plaintext.append(grid[row][col]);
                }
            }
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        TranpositionCipher cipher = new TranpositionCipher();

        String text = "PhuocNguyen";
        int[] key = {9, 11, 5, 2, 3, 6, 8, 1,4,7,10};

        String encrypted = cipher.encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = cipher.decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);
    }
}
