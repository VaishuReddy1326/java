import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectInputStreamEx1 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the customer name");

            String customerName = sc.next();

            FileInputStream fis = new FileInputStream("data.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();

            Bank[] list = new Bank[count];

            for(int i = 0;i < count; i ++){
                list[i] = (Bank) ois.readObject();
            }
           
            
            ois.close();
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
