import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class StreamEx {

    public static void main(String[] args) {

        try{

        FileOutputStream fos = new FileOutputStream("duck.txt");
        DataOutputStream dos = new DataOutputStream(fos); // it creates binary file

        dos.writeUTF("john");

        dos.writeInt(16);

        dos.writeDouble(12.6);

        dos.close();

        fos.close();
        }
        catch(Exception e) {

            e.printStackTrace();
        }

    }
}