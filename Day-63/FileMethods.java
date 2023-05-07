
import java.io.File;
import java.io.IOException;
public class FileMethods {
    public static void main(String[] args) throws IOException{
        File file = new File("dog.java");

        if(file.exists()) {
            System.out.println("file is already there");
            System.out.println("deleting the file");
            file.delete();
            System.out.println("file has been deleted");

        }
        else {
            System.out.println("creating a file");
            System.out.println(file.createNewFile());
        }
        System.out.println(file.length());

        System.out.println(file.getPath());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getName());

    }
    
}
