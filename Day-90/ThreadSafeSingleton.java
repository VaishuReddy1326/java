public class ThreadSafeSingleton {
    
    public static void main(String[] args) {

        System.out.println(X.getInstance());

        System.out.println(X.getInstance()); 


    }
    
}
class X {

    private static X obj;  // default value is null
    private X() {

    }
    synchronized public static X getInstance() {  // synchronized method access multiple statements simultaneously

        if(obj == null) {  // if the condition is true ,new object is created

            obj = new X();
        }
        return obj;
    }
}
