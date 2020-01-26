package chapter3.src.lowertouppercase;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class LowerToUpperCaseInputStreamTest {

    @Test
    void readCharByChar() {
        try {

            InputStream inputStream = new LowerToUpperCaseInputStream(new ByteArrayInputStream("Hello, How are you?".getBytes()));
            int c;
            while ((c = inputStream.read()) > 0) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}