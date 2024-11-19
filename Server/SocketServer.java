package Server;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

public class SocketServer {
    private static final int PORT =12345;
    public static void main(String[] args) {
        try{
            try(ServerSocket serverSocket = new ServerSocket(PORT)){
                System.out.println("Server is running..");
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");
                KeyPairGenerator keyPairGe = KeyPairGenerator.getInstance("DiffieHellman");
                keyPairGe.initialize(1024);
                KeyPair keyPair = keyPairGe.generateKeyPair();
                KeyAgreement keyPair2 = KeyAgreement.getInstance("DiffieHellman");
                keyPair2.init(keyPair.getPrivate());
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(keyPair.getPublic().getEncoded());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                byte[] clientPubKey = (byte[]) in.readObject();
                KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman");
                X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(clientPubKey);
                PublicKey cilentPub = keyFactory.generatePublic(x509KeySpec);
                keyPair2.doPhase(cilentPub,true);
                byte[] sharedSecret = keyPair2.generateSecret();
                SecretKeySpec secretKeySpec = new SecretKeySpec(sharedSecret,0,16, "AES");
                byte[] EnBytes = (byte[]) in.readObject();
                Cipher cipher = Cipher.getInstance("AES");
                cipher.init(Cipher.DECRYPT_MODE,secretKeySpec);
                String DeMessage = new String(cipher.doFinal(EnBytes));
                System.out.println("Received message from client: "+new String(EnBytes));
                System.out.println("Decrypted message from client: "+DeMessage);
                socket.close();
            }
            }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
