public class IslandOfIsolation {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = new Student();
        System.out.println(s1.name.rollno);
        s2 = null;
        System.out.println(s1.name.rollno);
        s1.name.name = new Student();
        s1.name.name.rollno = 10;
        System.out.println(s1.name.name);

        
    }
    
}
class Student {
    int rollno;
    Student name;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" +rollno +
                ",name='" + name + '\''+
                '}';
    }

}
