import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterEx {

    public static void main(String[] args) {

        try{

        CharArrayWriter output = new CharArrayWriter();

        output.write("hello world");

        FileWriter f1 = new FileWriter("Duck.txt");

        FileWriter f2 = new FileWriter("Rock.txt");

        output.writeTo(f1);

        output.writeTo(f2);

        f1.close();

        f2.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
    
}
