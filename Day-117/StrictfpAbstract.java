public strictfp class StrictfpAbstract {
    public static void main(String[] args) {

        new Dog().sound();

    }
}
strictfp abstract class Animal {

   

    abstract void sound();
}
class Dog extends Animal {
    void sound() {

        System.out.println("Bow Bow");

    }
}
