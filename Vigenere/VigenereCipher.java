
package nhanle.Vigenere;

public class VigenereCipher {

    public static String vigenereCipher(String text,String key,boolean encrypt) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        int keyLenght = key.length();
        int keyIndex =0;
        for(char character : text.toCharArray()) {
            if(Character.isLetter(character)) {
                char base = Character.isUpperCase(character)? 'A': 'a';
                int shift = key.charAt(keyIndex%keyLenght)-'a';
      
                if(!encrypt){
                    shift =26 - shift;
                }
                result.append((char)(character - base +shift)%26 +base);
                keyIndex++;
            }
            else {
                result.append(character);
            }
        }
        return result.toString();
    }
    public static String encrypt(String text, String key) {
        return vigenereCipher(text,key,true);
    }
    public static String decrypt(String text, String key) {
        return vigenereCipher(text, key, false);
    }
}

 
