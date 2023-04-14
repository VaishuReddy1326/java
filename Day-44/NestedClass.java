

public class NestedClass {
    public static void main(String[] args){
        Outer.Inner o=new Outer().new Inner();
        o.display();
    }

    
}
class Outer{
    class Inner{
        public void display(){
            System.out.println("display...");
        }
    }
}
