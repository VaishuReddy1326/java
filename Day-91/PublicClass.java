// every java file contains only one public class

public class PublicClass {

    public static void main(String[] args) {

        Nick n = new Nick();

        //Dog d = new Dog();  we cannot create the object of abstract class

    }
    
}
class Nick {

}
/* private class Duck{ //the outer class cannot be declared as private

} */
/* protected class Duck{
    // the outer class cannot be declared as protected
} */
abstract class Dog { // we cannot create the object of abstract class

}
final class cat {
    // we cannot extend the final class
}
