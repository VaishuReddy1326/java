interface A{
    public  void display();
 } 

interface B{
    public  void show();
 }
class C implements A,B{
    public void show(){
        System.out.println("show..");
    }
    public void display(){
        System.out.println("display..");
    }
}

public class MultipleInheritance extends C{
    public static void main(String[] args){
        C obj=new C();
        obj.show();
        obj.display();

    }
    
}
