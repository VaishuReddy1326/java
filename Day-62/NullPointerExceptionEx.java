

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        String s = "null";
        try {
            System.out.println(s.length());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        Dog d = new Dog();
        System.out.println(d.a.length());
    }
    
}
class Dog {
    String a;
}
