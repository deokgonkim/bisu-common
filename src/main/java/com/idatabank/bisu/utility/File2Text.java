package com.idatabank.bisu.utility;

import com.idatabank.bisu.InternalException;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File2Text {
    public File2Text() {
    }
    
    public static String toString(File f) throws InternalException {
        String content = null;
        
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        
        byte[] buf = null;
        int read = 0;
        
        try {
            fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);
            baos = new ByteArrayOutputStream();
            
            while ( ( read = bis.read() ) != -1 ) {
                baos.write(read);
            }
            
            buf = baos.toByteArray();
            
            content = new String(buf);
            
        } catch ( FileNotFoundException e ) {
            throw new InternalException(e);
        } catch ( IOException e ) {
            throw new InternalException(e);
        } finally {
            if ( bis != null ) {
                try {
                    bis.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
            
            if ( baos != null ) {
                try {
                    baos.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }
        
        return content;
    }
}
