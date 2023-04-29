

public class LocalVariable {
    void add() {
        int a = 10;   //local variable
        int b = 20;   //local variable
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);

        LocalVariable var = new LocalVariable();

        var.add();


    }
    
}
