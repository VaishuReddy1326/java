import java.io.FileInputStream;
import java.util.Scanner;

public class FileStreamsEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte[] array;

        try {

        FileInputStream fs = new FileInputStream("hello.txt");

        array = new byte[fs.available()];

        fs.read(array);

        String str = new String(array);

        System.out.println(array);

        fs.close();
        }catch(Exception e) {

            e.getStackTrace();
        }
    }
    
}
