

public class OverrideAnnotation {

    public static void main(String[] args) {

        Nick n = new Nick();
        n.showman();

    }
    
}
class Nick {

    void showman() {

        System.out.println("nick");
    }
}
class Rock extends Nick {
    @Override
    void showman() { // here we are overriding the method,it takes more time as compared to methodoverloading because every time we have to check

        System.out.println("Rock");
    }
}
