public class LazySingletonDesignPattern {

    public static void main(String[] args) {

        System.out.println(X.getInstance());

        System.out.println(X.getInstance()); // if the condition false , then it will return the previous object reference


    }
    
}
class X {

    private static X obj;  // default value is null
    private X() {

    }
    public static X getInstance() {

        if(obj == null) {  // if the condition is true ,new object is created

            obj = new X();
        }
        return obj;
    }
}
