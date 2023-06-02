

public class SuperKeyword {
    public static void main(String[] args) {

        Duck d = new Duck();

        Duck d1 = new Duck(3);

    }
    
}
class Nick {

    Nick() {
        System.out.println("default parent");
    }
    Nick(int a) {
        System.out.println("one parent");
    }
    Nick(int a , int b) {
        System.out.println("two parent");
    }
}
class Duck extends Nick {
    Duck() {
        super(4);
        System.out.println("default child");
    }
    Duck(int a) {
        super(5,6);
        System.out.println("one child");
    }
    Duck(int a , int b) {
        System.out.println("two child");
    }
}
