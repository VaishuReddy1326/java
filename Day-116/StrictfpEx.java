public class StrictfpEx {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(multiply());
    }
    static strictfp double sum() {
        double num1 = 23.44567;
        double num2 = 17.2346;
        return num1+num2;
    }
    static strictfp double multiply() {
        double num1 = 15e+15;
        double num2 = 10e+8;
        return num1*num2;
    }
    
}
