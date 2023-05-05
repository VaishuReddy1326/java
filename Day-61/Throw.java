public class Throw {

    static void fun() {
        try {
            throw new ArithmeticException("hello");
        }
        catch(ArithmeticException e) {
            System.out.println("caught inside fun");
            throw e;

        }
    }
        public static void main(String[] args) {
            try {
                fun();
            }
            catch(ArithmeticException e) {
                System.out.println("caught inside main");
            }
        }
    
    
}
