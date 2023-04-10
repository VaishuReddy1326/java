//encapsulation is a proces  of binding the data and methods into a sigle unit
public class Encapsulation {
    public static void main(String[] args){
       Student s=new Student();
       s.setName("dog");
       System.out.println(s.getName());
       s.setCollege("svu");
       System.out.println(s.getCollege());
       s.setRollno(101);
       System.out.println(s.getRollno());
    }
    
}
class Student{
    private String name;
    private String college;
    private int rollno;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college=college;
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }


}
