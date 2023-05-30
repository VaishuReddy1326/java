public class InstanceOfEx {
    public static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.length);

        if(square instanceof Rectangle) {

            Rectangle rectangle = (Rectangle) square;

            System.out.println(rectangle.length);

        }

    }
    
}
class Square {

    int length = 25;

}
class Rectangle extends Square {

    int length = 30;
}
