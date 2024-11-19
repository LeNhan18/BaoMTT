package Caeser1;
public class CaeserCipher {
    public static String caeserCipher(String text,int key,boolean encrypt) {
        StringBuilder result = new StringBuilder();
        int shift = encrypt ? key : -key;
        for(char character : text.toCharArray()) {
            if(Character.isLetter(character)) {
                char base = Character.isUpperCase(character)? 'A': 'a';
                int offset = (character - base + shift) % 26;
                if(offset<0){
                    offset += 26;
                }
                result.append((char)(base + offset));
            }
            else {
                result.append(character);
            }
        }
        return result.toString();
    }
    public static String encrypt(String text, int key) {
        return caeserCipher(text,key,true);
    }
    public static String decrypt(String text, int key) {
        return caeserCipher(text, key, false);
    }
    
}
