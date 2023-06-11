import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
    public static void main(String[] args) throws FileNotFoundException {
        
        byte[] array;

        try {

            FileInputStream inputstream = new FileInputStream("Rock.txt");

            array = new byte[inputstream.available()];

            int i = inputstream.read();

            System.out.println((char)i);

            System.out.println(inputstream.skip(4));

            inputstream.close();


        }catch(Exception e) {

            e.getStackTrace();
        }
    }
    
}
