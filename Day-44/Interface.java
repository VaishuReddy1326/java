interface Animal{
    public void sound();
    public void eat();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("bow bow");
    }
    public void eat(){
        System.out.println("eating");
    }
}
class Cat extends Dog{
    public void sleep(){
        System .out.println("sleeping..");
    }
}

public class Interface {
    public static void main(String[] args){
        Cat c=new Cat();
        c.sound();
        c.eat();
        c.sleep();

    }
    
}
