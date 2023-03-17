

public class PassBy_Value {
    public static void main(String[] args){
        int x=50;
        System.out.println(x); //50
        add(x);
        System.out.println(x); //50

    }
    public static void add(int x){

        System.out.println(x);//50
        
    }
}
