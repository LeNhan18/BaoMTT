
package RailFence;
public class RailFenceCipher {
    public static String encrypt(String text,int key){
        if(key<=1){
            return text;
        }
        char[] c = text.toCharArray();
        char[] result = new char[c.length];
        int cycle = 2 * key -2;
        int idx = 0;
        for(int i=0;i<key;i++){
            for(int j=0;i+j<c.length;j+=cycle){
                result[idx++] = c[i+j];
                if(i!=0 && i!=key-1&& j+cycle-i<c.length)
                {
                    result[idx++] = c[j+cycle-i];
                }
            }
        }
        return new String(result);
    }
    public static String decrypt(String text,int key){
        if(key<=1){
            return text;
        }
        char[] c = text.toCharArray();
        char[] result = new char[c.length];
        int cycle = 2 * key- 2;
        int idx = 0;
        for(int i=0;i<key;i++){
            for(int j=0;i+j<c.length;j+=cycle){
                result[i+j] = c[idx++];
                if(i!=0 && i!=key-1&& j+cycle-i<c.length)
                {
                    result[j+cycle-i] = c[idx++];
                }
            }
        }
        return new String(result);
    }
    
    
}
