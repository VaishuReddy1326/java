//class implements multiple interface but extend only one class

public class InterfaceMethods implements cow,buffalo {

    public static void main(String[] args) {

        InterfaceMethods m = new InterfaceMethods();

        m.milk();

    }
    @Override
    public void milk(){
        cow.super.milk();
    }
    
}
interface cow {
    default void milk() {
        System.out.println("cow milk");

    }
}
interface buffalo {
    default void milk() {
        System.out.println("buffao milk");
    }
}
