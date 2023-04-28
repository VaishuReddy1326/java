

public class DryExample {
    static void college() {

        System.out.println("sv university");
    }
    static void ECE() {
        System.out.println("electronics branch");
        college();
    }
    static void CSE() {
        System.out.println("computerscience branch");
        college();
    }
    static void MECHANICAL() {
        System.out.println("mechanical branch");
        college();
    }
    public static void main(String[] args) {

        ECE();
        CSE();
        MECHANICAL();
    }

    
}
