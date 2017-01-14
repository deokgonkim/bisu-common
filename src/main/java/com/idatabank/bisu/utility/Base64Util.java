package com.idatabank.bisu.utility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Util {
    public Base64Util() {
    }
    
    public static String encode(byte[] abyte0) {
        BASE64Encoder base64encoder = new BASE64Encoder();
        ByteArrayInputStream bais = new ByteArrayInputStream(abyte0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] abyte1 = null;
        try {
            base64encoder.encodeBuffer(bais, baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        abyte1 = baos.toByteArray();

        return new String(abyte1).trim();
    }

    public static byte[] decode(String s) {
        BASE64Decoder base64decoder = new BASE64Decoder();
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] abyte0 = null;
        try {
            base64decoder.decodeBuffer(bais, baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        abyte0 = baos.toByteArray();

        return abyte0;
    }
}
