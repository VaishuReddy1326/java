import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {

        File file = new File("rock.txt");
        
        FileWriter filewriter = new FileWriter(file);

        filewriter.write("hello world");

        filewriter.append("\n this is append method");

        filewriter.write("\n this is write method");

        filewriter.flush();

        
        filewriter.write('a');

        filewriter.close();

        
    }
}
    