//Multipleinheritance means super class inhertits the features of sub class and that sub class acts as superclass for the next subclass
public class MultiLevelInheritance {
    public static void main(String[] args){
        Parrot p=new Parrot();
        p.parrot();
        p.dog();
        p.cat();
    }
    
}
class Cat{
    public void cat(){
        System.out.println("meow meow...");
    }
}
class Dog extends Cat{
    public void dog(){
        System.out.println("bow bow...");
    }
}
class Parrot extends Dog{
    public void parrot(){
        System.out.println("koo koo...");
    }
}

