package Lab3;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import javax.crypto.*;




public class DES {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        KeyGenerator kg = KeyGenerator.getInstance("DES");
        kg.init(new SecureRandom());
        SecretKey key = kg.generateKey();
        String algorithm = key.getAlgorithm();
        byte[] b = key.getEncoded();



            System.out.print("A random DES key (the 8 bytes) :" + Arrays.toString(b));
            System.out.println("\n");
            System.out.println("In Hex: ");

        for (byte b2 : b) {
            String st = String.format("%02X", b2);
            System.out.print(st);
        }


        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        KeyPair kp = kpg.generateKeyPair();
        RSAPublicKey r = (RSAPublicKey) kp.getPublic();
        RSAPrivateKey s = (RSAPrivateKey) kp.getPrivate();



        BigInteger n = r.getModulus();
        BigInteger e = r.getPublicExponent();
        BigInteger d = s.getPrivateExponent();

        System.out.println(n);
        System.out.println(e);
        System.out.println(d);









        }
    }


