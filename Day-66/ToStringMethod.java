

public class ToStringMethod {

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
    public void setname(String name) {
        this.name = name;
    }
    public ToStringMethod(int id , String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {

        ToStringMethod str = new ToStringMethod(1,"java");

        System.out.println(str.toString());
    }
    @Override
    public String toString() {

        return id +" "+ name;
    }
    
}
