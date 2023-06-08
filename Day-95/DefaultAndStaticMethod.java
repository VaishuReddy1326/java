

public class DefaultAndStaticMethod implements QR{
    @Override
    public void duck() {
        System.out.println("hello");
    }
    public static void main(String[] args) {

        DefaultAndStaticMethod ds = new DefaultAndStaticMethod();
        ds.print();
        Nick.Dog();
        ds.s1();
        ds.s2();

    }
    @Override
    public void s1() {
        System.out.println("s1 method");
    }
    @Override
    public void s2() {
        System.out.println("s2 method");
    }

    
}
interface Nick {

    void duck();
    static void Dog() {
        System.out.println("interface contains abstract and static methods");
    }
    default void print() {
        System.out.println("hi");
    }
}
interface R{
    void s1();

}
interface QR extends Nick,R{ // we are extending two interfaces but not implementing because QR is an interface
    void s2();
}
