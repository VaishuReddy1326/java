
class Teacher{
    String name;
    public void teach(){
        System.out.println("teaching...");
    }
    class Student{
        int rollno=101;
        public void read(){
            System.out.println("reading a book");
        }

    }
}

public class InnerClass {
    public static void main(String[] args){
        Teacher t=new Teacher();
        Teacher.Student obj=t.new Student();
        t.teach();
        obj.read();
    
    }
    
}
