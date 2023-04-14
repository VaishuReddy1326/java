

public class Abstraction {
    public static void main(String[] args){
        SBI s=new SBI();
        s.deposit();
        s.withdraw();
        s.interestRate();


    }
    
}
abstract class RBI{
    abstract public void  interestRate();
    void deposit(){
        System.out.println("amount is deposited");
    }
    void withdraw(){
        System.out.println("amount is withdraw");
    }
}
 class SBI extends RBI{
    public void interestRate(){
        System.out.println("15%");

    }
}
