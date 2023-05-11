

public class GetClassMethod {
    public static void main(String[] args) {

        dog d = new dog();

        System.out.println(d.getClass());

        System.out.println(d.getClass().getName());

    }
    static  class dog {
        String name;
    }
    
}
