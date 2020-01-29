package chapter3.src.lowertouppercase;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerToUpperCaseInputStream extends FilterInputStream {
    protected LowerToUpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return Character.toUpperCase(c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int size = super.read(b, off, len);

        for(int i = off; i < off+size; i++){
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return  size;
    }
}
