import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {

    public static void main(String[] args) {

        try {

        FileInputStream fis = new FileInputStream("Duck.txt");

        FileInputStream fis1 = new FileInputStream("Rock.txt");

        SequenceInputStream sin = new SequenceInputStream(fis, fis1);

        System.out.println(sin.read());

        System.out.println(sin.available());

        int x;
        while((x = sin.read())!= -1) {
            System.out.print((char)x);

        }
        fis.close();
        fis1.close();
        sin.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }


    }
    
}
