

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("rock.txt");

            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());

            System.out.println(br.markSupported());

            br.mark(7);

            System.out.println((char)br.read());

            br.reset();

            br.close();

        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
    
}
