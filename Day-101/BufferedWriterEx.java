
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterEx {

    public static void main(String[] args) {
        try{

            FileWriter fw = new FileWriter("rock.txt");

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("welcome");

            bw.write("java");

            bw.close();

        
        }
        catch(Exception e){

            e.printStackTrace();
        }


    }
    
}
