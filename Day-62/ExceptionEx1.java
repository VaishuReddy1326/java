

public class ExceptionEx1 {
    public static void main(String[] args) {
        int a[] = new int[4];
        Duck d = new Duck();
        int start = 0;
        try {
            int x = Integer.parseInt(d.s);
            System.out.println(x);
            start = 1;
            int y = a[2];
            System.out.println(y);
            start = 2;
            int z = 4/0;
            System.out.println(z);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            if(start == 0)
                System.out.println("number format exception");
            else if(start == 1)
                System.out.println("array index out of bound exception");
            else if(start == 2)
                System.out.println("Arithmetic exception");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
class Duck {
    String s = "234";
    int age;

}