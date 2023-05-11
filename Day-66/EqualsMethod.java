

public class EqualsMethod {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public EqualsMethod(int id , String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        EqualsMethod eq1 = new EqualsMethod(1, "c++");

        EqualsMethod eq2 = new EqualsMethod(2, "java");

        EqualsMethod eq3 = new EqualsMethod(1, "c++");

        System.out.println(eq1.equals(eq1));

        System.out.println(eq1.equals(eq3));

        System.out.println(eq1.equals(eq2));




    }
    
}
