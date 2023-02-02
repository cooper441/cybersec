package Lab2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

public class bytes3 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // string to bytes
        String s = "Hello World!";
        byte[] b2 = s.getBytes("UTF8");

        byte[] input = b2; // byte array to convert
        StringBuilder sb = new StringBuilder();
        for (byte b3 : input) sb.append(String.format("%02X ", b3));
        String s2 = sb.toString();
//        System.out.println(s2);

        byte[] b3 = {0x12, 0x34, 0x56, 0x78, (byte)0x9A, (byte)0xBC, (byte)0xDE,
                (byte)0xF0}; // 8-byte array
        Base64.Encoder encoder = Base64.getEncoder();
        String s3 = encoder.encodeToString(b3);
        System.out.println(s3);

        String s4 = "V2hvIGNvbnRyb2xzIHRoZSBwYXN0IGNvbnRyb2xzIHRoZSBmdXR1cmU7IHdobyBjb250cm9scyB0aGUgcHJlc2VudCBjb250cm9scyB0aGUgcGFzdC4=";

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] b4 = decoder.decode(s4);

        System.out.println(b4);
        System.out.println(Arrays.toString(b4));



    }
}
