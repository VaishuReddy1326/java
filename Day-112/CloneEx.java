

public class CloneEx {
    public static void main(String[] args) {

        Addition a = new Addition();
        a.x = 10;
        a.y = 30;

        Addition a1 = (Addition)a.clone();

        System.out.println(a1.x);
        System.out.println(a1.y);

    }
    
}
class Addition implements Cloneable 
{
    int x;
    int y;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

