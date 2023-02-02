package Lab2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class bytes2 {
    public static void main(String[] args) throws UnsupportedEncodingException {


        // string to bytes
        String s = "Hello World!";
        byte[] b2 = s.getBytes("UTF8"); // UTF-8 is an encoding for strings. Or just use s.getBytes() for default encoding;

        System.out.println(b2); // still jumbled symbols here

        // converting bytes (that came from a UTF-8 string) back to string
        s = new String(b2, "UTF8"); // or just new String(b) for default encoding
        System.out.println(s);

        System.out.println(Arrays.toString(b2));
    }
}
