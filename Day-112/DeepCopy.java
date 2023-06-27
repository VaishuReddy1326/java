

public class DeepCopy {
    public static void main(String[] args) {

        Substraction s = new Substraction();
        s.a = 10;
        s.b = 20;

        Substraction s1 = new Substraction();
        s1.a = s.a;
        s1.b = s.b;

        System.out.println(s.a);
        System.out.println(s1.a);
        s1.b = 78;
        System.out.println(s.a);
        System.out.println(s1.a);


    }
    
}
class Substraction {
    int a;
    int b;
}
