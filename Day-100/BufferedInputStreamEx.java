import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

    public static void main(String[] args) {

    try{
        FileInputStream fis = new FileInputStream("Dock.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        int x;

        System.out.println(bis.available());

        while((x = bis.read()) != -1) {

            System.out.print((char)x);
        }

        fis.close();
        bis.close();
    }
    catch(Exception e) {
        e.getStackTrace();
    }


    }
    
}
