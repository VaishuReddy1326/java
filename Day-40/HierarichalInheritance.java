// hierarichalinheritance means one class serves as  parent class for more than one child classes
public class HierarichalInheritance {
    public static void main(String[] args){
       B obj=new B();
       obj.read();
       obj.write();
       C obj1=new C();
       obj1.read();
       System.out.println("bookname:"+obj1.bookname);
    }

}
class A{
    public void read(){
        System.out.println("read the data");
    }
    
}
class B extends A{
    public void write(){
        System.out.println("write the data");
    }
}
class C extends A{
    String bookname="java";
}

