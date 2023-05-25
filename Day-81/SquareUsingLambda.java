

public class SquareUsingLambda {
    public static void main(String[] args) {

        squareEx s = x -> {
            System.out.println(x*x);
        };
            
        
        s.square(12);

    }
    
}
interface squareEx {
    void square(int x);
}
