public class UnreachableObject {
    public static void main(String[] args){

        Student s = new Student();
        s = null; // s is called unreachable object,it is eligible for garbage collection

    }
}
class Student {
    int rollno;
    String name;
}