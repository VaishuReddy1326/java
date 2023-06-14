import java.io.FileReader;

public class FileReaderEx {

    public static void main(String[] args) {

        try{

            FileReader fr = new FileReader("duck.txt");

            System.out.println((char)fr.read());

            int i = 0;

            while((i=fr.read())!=-1) {

                System.out.print((char)i);

            }
            fr.close();
        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
    
}
