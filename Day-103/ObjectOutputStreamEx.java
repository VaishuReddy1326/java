import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class ObjectOutputStreamEx {

    public static void main(String[] args) {
        try {

            SoftwareEngineer s = new SoftwareEngineer();
            s.setName("john");
            s.setAge(18);
            s.setWeight(56.8);

            FileOutputStream fos = new FileOutputStream("rock.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            long serialUID = ObjectStreamClass.lookup(s.getClass()).getSerialVersionUID();
            System.out.println(serialUID);

            oos.close();
            fos.close();
        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }
    
}
class SoftwareEngineer implements Serializable { //serializable is an interface it converts object to stream

    static String name;

    transient double weight;

    int age;

    void sayHi() {
        System.out.println("hi"+this.name);
    }
    static void hi(int x) {
        int y = 1000;
        System.out.println(y);
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
