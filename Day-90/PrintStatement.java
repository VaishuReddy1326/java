

public class PrintStatement {

    public static void main(String[] args) {

        System1.out.println("rock");
            // here system1 is the class ,out is the field of system1 class
    }
    
}
class System1 {

    public static PrintStream out;

}
class PrintStream {

    public static void println(String str) {  // method should be static ,otherwise exception will occur

        System.out.println(str);
    }
}

