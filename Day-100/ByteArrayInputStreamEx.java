import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInputStreamEx {

    public static void main(String[] args) {

        byte array[] = {'a','b','c','d','e'};

        ByteArrayInputStream bis = new ByteArrayInputStream(array);

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());

        System.out.println(bis.markSupported());

        bis.mark(2);

        System.out.println((char)bis.read());

        bis.reset();

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());
    }
    
}
