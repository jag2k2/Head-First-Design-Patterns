package decorator.lowercase;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LowerCaseInputStreamTest {

    @Test
    void read() {
       try {
           String file = ".\\test\\decorator\\lowercase\\file.txt";
           InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)));

            int c;
            while((c = inputStream.read()) >= 0){
                System.out.print((char)c);
            }

            inputStream.close();

        } catch (Exception ex) {ex.printStackTrace();}
    }
}