public class DefaultConstructor {
    public static void main(String[] args) {

        C c = new C();

    }
    
}
class A {
    // it is a child class of object class
    A() {
        System.out.println("A");
    }

}
class B extends A {
    B() {
        // by default super() constructor present in the child class constructor
        System.out.println("B");
    }
}
class C extends B {
    C() {
        //super();  by default super constructor present in every child class 
        System.out.println("C");
    }
}
