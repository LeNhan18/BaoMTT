package Server;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;

public class SocketClient {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int PORT=12345;
    public static void main(String[] args) {
        try{
            try(Socket socket =new Socket(SERVER_IP,PORT)){
                KeyPairGenerator keyPairGe = KeyPairGenerator.getInstance("DiffieHellman");
                keyPairGe.initialize(1024);
                KeyPair keyPair = keyPairGe.generateKeyPair();
                KeyAgreement keyPair2 = KeyAgreement.getInstance("DiffieHellman");
                keyPair2.init(keyPair.getPrivate());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                byte[] clientPubKey = (byte[]) in.readObject();
                KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman");
                X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(clientPubKey);
                PublicKey cilentPub = keyFactory.generatePublic(x509KeySpec);
                keyPair2.doPhase(cilentPub,true);
                byte[] sharedSecret = keyPair2.generateSecret();
                SecretKeySpec secretKeySpec = new SecretKeySpec(sharedSecret,0,16, "AES");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter text: ");
                String text = sc.nextLine();
                Cipher cipher = Cipher.getInstance("AES");
                cipher.init(Cipher.ENCRYPT_MODE,secretKeySpec);
                byte[] EnByte = cipher.doFinal(text.getBytes());
                out.writeObject(EnByte);
            }
        }catch(IOException | NoSuchAlgorithmException | InvalidKeyException | ClassNotFoundException |
               NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException |InvalidKeySpecException  e){
            e.printStackTrace();
        }
    }
}
