import java.io.FileWriter;

public class FileWriterEx {

    public static void main(String[] args) {

        try{

            FileWriter fw = new FileWriter("rock.txt");

            fw.write("hello");

            fw.write("hello");

            fw.close();
        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
    
}
