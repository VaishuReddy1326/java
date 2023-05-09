import java.io.*;
import java.util.Date;
public class FileMethods {
    public static void main(String[] args) throws IOException {
        File f1 = new File("mock.txt");

        File f2 = new File("rock.txt");

        System.out.println(f1.createNewFile());

        System.out.println(f1.canRead());

        System.out.println(f1.canWrite());

        System.out.println(f1.canExecute());

        System.out.println(f1.isHidden());

        System.out.println(f1.isFile());

        System.out.println(f1.isDirectory());

        System.out.println(f1.isAbsolute());

        f1.renameTo(new File("dog.txt"));

        System.out.println(new Date(f1.lastModified()));

        
    }

    
}
