

public class MethodChaining { 
    public static void main(String[] args) {

        String str = "    hello";

        String res = str.toUpperCase();

        System.out.println(res);

        String res1 = str.concat("world").toUpperCase().replace('O','X').trim();

        System.out.println(res1);



    }
    
}
