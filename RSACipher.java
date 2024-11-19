import java.math.BigInteger;
import java.util.Random;

public class RSACipher {
    private BigInteger p,q,N,r,E,D;
    private int bitlenght;
    public RSACipher(int bitlenght) {
        this.bitlenght = bitlenght;
        generateKey();

    }
    private void generateKey(){
        p = BigInteger.probablePrime(bitlenght/2, new Random());
        q = BigInteger.probablePrime(bitlenght/2, new Random());
        N = p.multiply(q);
        r = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        do{
            E = new BigInteger(bitlenght, new Random());

        }while((E.compareTo(r) != 1 )||(E.gcd(r).compareTo(BigInteger.ONE) != 0));
        D= E.modInverse(r);
    }
    public BigInteger[] encrypt(String m){
        byte[] b = m.getBytes();
        BigInteger[] e = new BigInteger[b.length];
        for(int i=0;i<b.length;i++){
            e[i] = new BigInteger(new byte[]{b[i]}).modPow(E,N);
        }
        return e;
    }
    public String decrypt(BigInteger[] m,BigInteger d,BigInteger n){
        byte[] b = new byte[m.length];
        for(int i=0;i<m.length;i++){
            b[i] = m[i].modPow(d,n).byteValue();
        }
        return new String[b];

    }
    public BigInteger getP(){
        return p;
    }
    public BigInteger getQ(){
        return q;
    }
    public BigInteger getN(){
        return N;

    }
    public BigInteger getE(){
        return E;
    }
    public BigInteger getD(){
        return D;
    }



}
