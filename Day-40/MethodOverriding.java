//MethodOverriding means subclass has the same method declared in subclass.
public class MethodOverriding {
    public static void main(String[] args){
        Oval obj=new Oval();
        obj.draw();
        Triangle t=new Triangle();
        t.draw();
        Rectangle r=new Rectangle();
        r.draw();
    }  
}                                                                                    
 class Shape{
    public void draw(){
        System.out.println("draw..");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("draw rectangle ");
    }
}
class Triangle  extends Shape{
    public void draw(){
        System.out.println("draw triangle");
    }
}
 class Oval extends Shape{
    public void draw(){
        System.out.println("draw oval");

    }
}

