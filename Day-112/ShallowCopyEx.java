//when you create a copy of an object all the fields of the original objects are copied exactly

public class ShallowCopyEx {
    public static void main(String[] args) {

        Addition add = new Addition();
        add.a = 10;
        add.b = 20;

        Addition add1 = add;
        add1.a = add.a;
        add1.b = add.b;

        System.out.println(add1.a);
        System.out.println(add.a);
        add1.b = 60;
        System.out.println(add1.a);
        System.out.println(add.a);

    }
    
}
class Addition {
    int a;
    int b;
}
