package decorator.lowercase;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream){
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int byteRead =  super.read();
        return (byteRead == -1 ? byteRead : Character.toLowerCase((char)byteRead));
    }

    /*@Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result =  super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }*/
}
