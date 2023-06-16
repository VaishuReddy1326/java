import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class SerialUID {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("rock.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            SoftwareEngineer se = (SoftwareEngineer)ois.readObject();

            System.out.println(ObjectStreamClass.lookup(se.getClass()));
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
    
}
