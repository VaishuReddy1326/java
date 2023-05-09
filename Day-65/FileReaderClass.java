import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException{

        FileReader reader = new FileReader(new File("rock.txt"));

        int a = reader.read();

        while(a != -1) {
            System.out.print((char)a);

            a = reader.read();
        }
        System.out.println();

        Scanner sc = new Scanner(new File("rock.txt"));

        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        reader.close();
    }
    
}
