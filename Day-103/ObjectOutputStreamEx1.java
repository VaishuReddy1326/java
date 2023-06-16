import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamEx1 {
    public static void main(String[] args) throws IOException{

        Bank[] customers = {new Bank("john",27,30000),
                            new Bank("king",22,56000) };
        
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(customers.length);

        for(int i=0;i<customers.length;i++)
            oos.writeObject(customers[i]);

        oos.close();
        fos.close();
    }
    
}
class Bank implements Serializable {
    String name;
    int age;
    double balance;
    Bank() {

    }
    Bank(String name,int age,double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
}
