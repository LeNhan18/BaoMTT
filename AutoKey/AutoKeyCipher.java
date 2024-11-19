
package AutoKey;

public class AutoKeyCipher {
    public String encrypt(String p , String key){
        p = p.toUpperCase();
        key=key.toUpperCase();
        StringBuilder c = new StringBuilder();
        int keyIndex =0;
        
        for(int i= 0;i<p.length();i++){
            char pc = p.charAt(i);
            if(Character.isLetter(pc)){
                char kc;
                if(keyIndex < key.length())
                {
                    kc = key.charAt(keyIndex);
                    keyIndex++;
                }else{
                    kc = p.charAt(i- key.length());
                }
                int shift = kc-'A';
                char e =(char) ((pc-'A'+shift)%26+'A');
                c.append(e);
            }
        }
        return c.toString();
    }
    public String decrypt(String c, String key){
         c = c.toUpperCase();
        key=key.toUpperCase();
        StringBuilder p = new StringBuilder();
        int keyIndex =0;
        
        for(int i= 0;i<c.length();i++){
            char cc = c.charAt(i);
            if(Character.isLetter(cc)){
                char kc;
                if(keyIndex < key.length())
                {
                    kc = key.charAt(keyIndex);
                    keyIndex++;
                }else{
                    kc = p.charAt(i- key.length());
                }
                int shift = kc-'A';
                char d=(char) ((cc-'A'+shift)%26+'A');
                p.append(d);
            }
        }
        return p.toString();
    }
    
}
