import java.io.FileOutputStream;

public class FileOutputStreamEx {

    public static void main(String[] args) {

        byte[] array;
        try {
            
        FileOutputStream outputstream = new FileOutputStream("Dog.txt");

        String str = "welcome to java";

        array = str.getBytes(); // converting string into byte array

        outputstream.write(array);


        }
        catch(Exception e) {
            
            e.getStackTrace();
        }


    }
    
}
