@FunctionalInterface
interface Rock {
    void mock(int x,int y);
}
class main {
    main() {
        System.out.println("main1");
    }
    main(int x , int y) {
        System.out.println(x *y);
    }
}

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        
        Rock rock = main :: new;

        rock.mock(10,30);
    }
    
}
