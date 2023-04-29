

public class InstanceVariable {
     public int a = 10; //global variable

    void add() {
        int b = 15;
         System.out.println(a+b);
    }
    public static void main(String[] args) {
        InstanceVariable var = new InstanceVariable();

        System.out.println(var.a);

        var.add();
    }
    
}
