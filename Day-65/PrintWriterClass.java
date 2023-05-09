import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
public class PrintWriterClass {
    public static void main(String[] args) throws IOException {

        PrintWriter printwriter = new PrintWriter(new FileWriter(new File("world.txt"),true));

        printwriter.println("welcome");

        printwriter.append("\n this is append method");

        printwriter.write("\n this is write method");

        printwriter.flush();

        printwriter.close();

    }    
}
