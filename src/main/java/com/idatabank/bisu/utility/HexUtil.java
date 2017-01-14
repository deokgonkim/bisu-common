package com.idatabank.bisu.utility;

public class HexUtil {
    public HexUtil() {
    }
    
//    public static void main(String[] arg) {
//        System.out.println(HexUtil.toHexString("ÇÑ±Û".getBytes()));
//    }
    
    public static String toHexString(byte[] bytestream) {
        StringBuffer sb = null;
        if ( bytestream == null || bytestream.length == 0 ) {
            return null;
        }
        
        sb = new StringBuffer();
                
        for ( int i = 0 ; i < bytestream.length ; i ++ ) {
            char charstream = (char)bytestream[i];
            String hexByte1 = null;
            String hexByte2 = null;
            int byte1 = charstream / 16;
            int byte2 = charstream - ( ( charstream / 16 ) * 16 );
            
            switch ( byte1 ) {
                case 10:
                    hexByte1 = "A";
                    break;
                case 11:
                    hexByte1 = "B";
                    break;
                case 12:
                    hexByte1 = "C";
                    break;
                case 13:
                    hexByte1 = "D";
                    break;
                case 14:
                    hexByte1 = "E";
                    break;
                case 15:
                    hexByte1 = "F";
                    break;
                default:
                    hexByte1 = String.valueOf(byte1);
            }
            
            switch ( byte2 ) {
                case 10:
                    hexByte2 = "A";
                    break;
                case 11:
                    hexByte2 = "B";
                    break;
                case 12:
                    hexByte2 = "C";
                    break;
                case 13:
                    hexByte2 = "D";
                    break;
                case 14:
                    hexByte2 = "E";
                    break;
                case 15:
                    hexByte2 = "F";
                    break;
                default:
                    hexByte2 = String.valueOf(byte2);
            }
            sb.append(hexByte1).append(hexByte2);
        }
        return sb.toString();
    }
}
