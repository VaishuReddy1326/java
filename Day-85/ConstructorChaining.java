public class ConstructorChaining {
    public static void main(String[] args) {

        Student s = new Student();

    }
    
}
class Student {
    Student(){
        this(10);
        System.out.println("student");
    }
    Student(int rollno) {
        this("john");
        System.out.println("rollno");
    }
    Student(String name) {
        this("john",10);
        System.out.println("name");
    }
    Student(String name,int rollno) {
        System.out.println(name+" "+rollno);
    }
}
