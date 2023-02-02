package Lab2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

public class bytes {

    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] b = {0x12, 0x34, 0x56, 0x78, (byte) 0x9A, (byte) 0xBC, (byte) 0xDE,
                (byte) 0xF0}; // 8-byte array
        System.out.println(b); // wrong
        System.out.println(b.toString()); // also wrong and does exactly the same as above
        System.out.println(new String(b)); // also wrong

    }
}

