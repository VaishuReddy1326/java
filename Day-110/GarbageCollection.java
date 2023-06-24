

public class GarbageCollection {
    public static void main(String[] args) {

        Student s1 = new Student(1,"king");
        s1.get();

        Student s2 = new Student(2,"john");
        s2.get();

        Student s3 = new Student(3,"queen");
        s3.get();

        s3 = s2;
        s3.get();
    }
    
}
class Student {

    int rollno;
    String name;

    Student(int rollno,String name){

        this.rollno = rollno;
        this.name = name;
    }
    public void get() {

        System.out.println("rollno:" +rollno);
        System.out.println("name:"+name);
    }
}
