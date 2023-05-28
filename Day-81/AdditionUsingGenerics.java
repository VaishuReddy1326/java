
public class AdditionUsingGenerics {
    public static void main(String[] args) {
      Addition a = new Addition();

      System.out.println(a.add(10,20));
      System.out.println(a.add(12.4f,5.6f));
      System.out.println(a.add(3.4,6.7));


    }
    
}
class Addition{
    public <T extends Number> Float add(T a,T b) {
        return a.floatValue()+b.floatValue();
        
    }
}
