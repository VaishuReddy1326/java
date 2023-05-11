

public class CloneMethod implements Cloneable {
    private int rno;
    private String name;
    public int getrno() {
        return rno;

    }
    public void setrno(int rno) {
        this.rno=rno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;  
    }
    public CloneMethod(int rno , String name) {
        super();
        this.rno = rno;
        this.name = name;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMethod cm = new CloneMethod(1 , "clone");

        CloneMethod cm1 = (CloneMethod)cm.clone();

        cm.setName("hello");

        System.out.println(cm.getrno() + " " + cm.getName());

        System.out.println(cm1.getrno() + " " + cm1.getName());
    }



    
}
