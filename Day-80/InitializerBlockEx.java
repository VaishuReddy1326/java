//intializer block executed every time whenever the object is created

public class InitializerBlockEx {
    public static void main(String[] args) {

        Duck d1 = new Duck();

        Duck d2 = new Duck();

        Duck d3 = new Duck();
    }
}
class Duck {
    {
    System.out.println("welcome to java");
    }

}
    
    

