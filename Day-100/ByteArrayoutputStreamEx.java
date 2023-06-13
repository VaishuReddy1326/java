import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayoutputStreamEx {

    public static void main(String[] args) throws Exception{

        FileOutputStream fos1 = new FileOutputStream("Duck.txt");

        FileOutputStream fos2 = new FileOutputStream("Rock.txt");
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        bos.write(95);

        bos.writeTo(fos1);

        bos.writeTo(fos2);

        bos.flush();

        bos.close();
    }
    
}
