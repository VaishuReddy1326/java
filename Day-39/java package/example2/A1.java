package example2;

public class A1 {
    private void msg(){
        System.out.println("welcome");
    }
}
public class A{
    public static void main(String[] args ){
        A1 obj=new A1();
        obj.msg();// compile time error because private methods are not accessible from outside the class
    }
}
