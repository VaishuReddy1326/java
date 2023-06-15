import java.io.PrintStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] aegs)throws Exception {

        FileOutputStream fos = new FileOutputStream("duck.txt");
        PrintStream ps = new PrintStream(fos);

        HDFC vaishnavi = new HDFC("vaishnavi");
        vaishnavi.setBalance(23567.78);
        vaishnavi.setMinBalance(10000);

        ps.println(vaishnavi.getName());
        ps.println(vaishnavi.getBalance());
        ps.println(vaishnavi.getMinBalance());

        fos.close();
        ps.close();

    }
    
}
class HDFC {

    String name;

    HDFC() {

    }
    HDFC(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getName(String name) {
        this.name = name;
    }
    double balance;
    int minBalance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance  = balance;
    }
    public int getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }
}

