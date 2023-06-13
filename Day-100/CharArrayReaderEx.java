import java.io.CharArrayReader;

public class CharArrayReaderEx {

    public static void main(String[] args) throws Exception{

        char[] ch = {'a','b','c','d','e','f','g'};

        CharArrayReader reader = new CharArrayReader(ch);

        int x = 0;

        while((x = reader.read()) != -1) {

            System.out.print((char)x);

        }

    }
    
}
