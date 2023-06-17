import java.util.Objects;

public class RecordEx {
    public static void main(String[] args) {

        person1 p1 = new person1("king",23);

        p1.sayHi();

        System.out.println(p1.name());

        System.out.println(p1.age());
    }
}

class Person {
    
    private String name;
    private int age;

    Person(){

    }

     Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "person{"+
                "name="+ name +
                "age=" + age + '\'' +
                '}';

    }
    @Override
    public boolean equals(Object o) {
       if(this == o) return true;
       if(!(o instanceof Person person)) return false;
       return getAge() == person.getAge() && Objects.equals(getName(),person.getName());

    }
    @Override
    public int hashCode() {
        return Objects.hash(getAge(),getName());
    }
}

