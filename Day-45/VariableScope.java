

public class VariableScope {
    public static void main(String[] args){
    int x=10;
    {
        System.out.println(x);
    }
    {
        //scope is within the block
        int z=20;
        System.out.println(z);
    }
    int y=40;
    System.out.println(y);
}
    
}
