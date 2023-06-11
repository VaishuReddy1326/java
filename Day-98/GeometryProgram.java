import java.util.Scanner;
/**
 * @author king
 */

public class GeometryProgram {
    /**
     * this is main method 
     * it is very important for the execution of the program
     * @param args 
     */
    
    public static void main(String[] args) {
        /**
         * create the object of area
         */

        Area a = new Area();
        /**
         * call the methods present in area class
         */
        a.circle();
        a.rectangle();
        a.triangle();
        /**
         * create the object of perimeter class
         */
        Perimeter p = new Perimeter();
        /**
         * call the methods present in perimeter class
         */
        p.circle();
        p.rectangle();
        p.triangle();
    }
    
}
class area {
    /**
     * Declare the variables
     */
    int r,l,b;
    double area;
    Scanner sc = new Scanner(System.in);
    /**
     * circle method
     */
    void circle() {
        System.out.println("enter the radius of the circle");
        r = sc.nextInt();
        /**
         * using formula to find the area of the circle
         */
        area = 3.14*r*r;
        /**
         * using output stream to print the area of the circle
         */
        System.out.println("area of the circle:"+area);
    }
    /**
     * rectangle method
     */
    void rectangle() {
        System.out.println("enter the length and breadth of the rectangle");
        /**
         * Taking input with the help of scanner class
         */
        l = sc.nextInt();
        b = sc.nextInt();
        /**
         * using formula to find the area of the rectangle
         */
        area = l*b;
        /**
         * using output stream to print the area of the rectangle
         */
        System.out.println("area of the rectangle:"+area);
    }
    /**
     * triangle method
     */
    void triangle() {
        System.out.println("enter the length and breadth of the triangle");
        /**
         * Taking input with the help of scanner class
         */
        l = sc.nextInt();
        b = sc.nextInt();
        /**
         *  using formula to find the area of the triangle
         */
        area = (l*b)/2;
        /**
         * using output stream to print the area of the triangle
         */
        System.out.println("area of the triangle:"+area);
    }
    
}
class Perimeter {
    /**
     * declare the variables
     */
    int r,l,b,h;
    double perimeter;
    Scanner sc = new Scanner(System.in);
    void circle() {
        System.out.println("enter the radius of circle");
        /**
         * Taking input with the help of scanner class
         */
        r = sc.nextInt();
        /**
         * using formula to find the perimeter of the circle
         */
        perimeter = 2*3.14*r;
        /**
         * using output stream to print the area of the circle
         */
        System.out.println("perimeter of the circle:" +perimeter);

    }
    void rectangle() {
        System.out.println("enter the length and breadth of the rectangle");
        /**
         * Taking input with the help of scanner class
         */
        l = sc.nextInt();
        b = sc.nextInt();
        /**
         * using formula to find the perimeter of the rectangle
         */
        perimeter = 2*(l+b);
        /**
         * using output stream to print the area of the rectangle
         */
        System.out.println("perimeter of the rectangle:"+perimeter);
    }
    void triangle() {
        System.out.println("enter the length and breadth of the traingle");
        /**
         * Taking input with the help of scanner class
         */
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        /**
         * using formula to find the perimeter of the triangle
         */
        perimeter = l+b+h;
        /**
         * using output stream to print the area of the triangle
         */
        System.out.println("perimeter of the triangle:"+perimeter);
    }
}


