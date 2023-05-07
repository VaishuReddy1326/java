

public class ClassCastException {
    public static void main(String[] args) {
        try {
        dog d = new dog();

        String s = (String)d;

        System.out.println(s);
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
    class dog {
        
    }
    
}
