//an  interface contains only one method,that is known as functional interfac
public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        Rock r = new Rock(){
        
            public void sayHi() {
                System.out.println("hi");
            }
        };
        r.sayHi();

    }
}
@FunctionalInterface
interface Rock {

    void sayHi();
}