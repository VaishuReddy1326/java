public class SingletonDesignPattern {

    public static void main(String[] args) {

        System.out.println(Dog.getDog());

        Dog.getDog().doSomething();

        System.out.println(Dog.a);

    }
    
}
class Dog {

    static int a = 67;

    private static Dog obj = new Dog(); 

    private Dog() {

    }
    public static Dog getDog() {

        return obj;
    }
    public void doSomething() {

        System.out.println("do something");
    }


}
