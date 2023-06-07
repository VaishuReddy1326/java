//This annotation is used when we declaring a variable,method or constructor,that cannot be used anywhere in the program
public class SupressedWarningAnnotation {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Duck d = new Duck();
        
    }
    
}
class Duck {
    @SuppressWarnings("unused")
    void run() {
        System.out.println("run");
    }
}
