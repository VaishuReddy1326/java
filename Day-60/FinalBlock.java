public class FinalBlock {
    public static void main(String[] args) {

        try {
            System.out.println(10/2);
        }

        catch(ArithmeticException e){        
            System.out.println("Arithmetic exception");
        }
        finally {
            System.out.println("final block always executed");
        }
    }
    
}
