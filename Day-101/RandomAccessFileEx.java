import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {

        try{

            RandomAccessFile raf = new RandomAccessFile("rock.txt", "rw");

            System.out.println((char)raf.read());

            System.out.println((char)raf.read());

            System.out.println((char)raf.read());

            raf.seek(3);

            System.out.println((char)raf.read());

            System.out.println(raf.getFilePointer());

            byte[] bytes = new byte[2];

            raf.read(bytes);

            raf.close();

        }
        catch(Exception e){

            e.printStackTrace();
        }
    }
    
}
