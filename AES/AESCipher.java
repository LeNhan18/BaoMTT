
package week_03.AES;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.management.openmbean.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESCipher {
    public static SecretKey generateKey(String s) throws NoSuchAlgorithmException {
        byte[] keyBytes =s.getBytes();
        SecretKey key = new SecretKeySpec(keyBytes, "AES");
        return key;

    }
    public static String encrypt(String plainText,String secretKey) throws Exception{

            SecretKey key=generateKey(secretKey);
            Cipher c = Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE,key);
            byte[] encrypted = c.doFinal(plainText.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
    }
    public static String decrypt(String cipherText,String secretKey) throws Exception{
        SecretKey key=generateKey(secretKey);
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE,key);
        byte[] decrypted = c.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decrypted);
    }
    public static String generateRe(String u,String pass){
        String re = u +":"+pass+":"+"encryptionKey";
        return re;
    }
    public static void saveRe(String re,String filename)throws IOException {
        try(FileOutputStream fis=new FileOutputStream(filename);
            ObjectOutputStream fos=new ObjectOutputStream(fis)){
            fos.writeObject(re);
        }

    }
    public static String readRe(String re,String filename)throws IOException ,ClassNotFoundException{
        try(FileInputStream fis=new FileInputStream(filename);
            ObjectInputStream fos=new ObjectInputStream(fis)){
            return (String) fos.readObject();
        }

    }
}