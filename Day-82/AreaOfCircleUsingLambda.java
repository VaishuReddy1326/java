import java.lang.Math;
public class AreaOfCircleUsingLambda {
    public static void main(String[] args) {

        Circle c = (r) -> {
            double res = 3.14*r*r;
            System.out.println(res);
        };
        c.circle(5);
    }
    
}
interface Circle {
    void circle(double r);
}