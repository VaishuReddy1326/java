

public class SumUsingLambda {
    public static void main(String[] args) {

        sum s = (x,y) ->{
            System.out.println(x+y);
            
        };
        s.sum(12,17);
        


    }
    
}
interface sum {
    void sum(int x,int y);
}
