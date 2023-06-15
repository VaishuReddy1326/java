import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.*;
public class DataInputStreamEx {

    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("rock.txt");

        DataInputStream dis = new DataInputStream(fis);

        HDFC hdfc = new HDFC(dis.readUTF());

        hdfc.setBalance(dis.readDouble());

        hdfc.setMinBalance(dis.readInt());

        System.out.println(hdfc.getName());

        System.out.println(hdfc.getBalance());

        System.out.println(hdfc.getMinBalance());
    }
    
}
