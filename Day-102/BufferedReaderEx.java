import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx {

    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("rock.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        HDFC hdfc = new HDFC(br.readLine());

        hdfc.setBalance(Double.parseDouble(br.readLine()));

        hdfc.setMinBalance(Integer.parseInt(br.readLine()));

        System.out.println(hdfc.getName());

        System.out.println(hdfc.getBalance());

        System.out.println(hdfc.getMinBalance());


    }
    
}
