// by using lambda expression ,we reduce the code

public class LambdaEx {
    public static void main(String[] args){

        cat c = () -> {
            System.out.println("meow meow");
        };
        c.bark();
    }
    
}
interface cat {

    void bark();

}
