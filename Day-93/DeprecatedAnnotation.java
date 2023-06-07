// we can use the deprecated annotation for classes,methods,variables,constructors
public class DeprecatedAnnotation {

    public static void main(String[] args) {

        Add a = new Add(4,7);

        a.add(4,6);

    }
 
}
class Add {
    @Deprecated
    //constructor
    Add(int a,int b) {
         System.out.println(a+b);
    }
    @Deprecated
    //method
    static void add(int a,int b) {
        System.out.println(a+b);
    }
}
class Add1 {
    Add1(double a,double b) {
        System.out.println(a+b);
    }
    static void add1(double a ,double b) {
        System.out.println(a+b);
    }
}
