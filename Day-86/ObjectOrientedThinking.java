import java.util.Arrays;

public class ObjectOrientedThinking {
    public static void main(String[] args) {

        Human h = new Human();
        h.setName("vaishnavi");
        h.setAge(21);
        h.setGender(Gender.female);

        Cars c1 = new Cars();
        c1.setBrand("honda");
        c1.setMilleage(121);
        c1.setPrice(800000);
        c1.setHavingAc(false);
        c1.setSeatingcapacity(7);

        Cars c2 = new Cars();
        c2.setBrand("kia");
        c2.setMilleage(167);
        c2.setPrice(1200000);
        c2.setHavingAc(true);
        c2.setSeatingcapacity(5);

        Cars cars[] = {c1,c2};
        h.setCars(cars);
        System.out.println(h);

        Dog d1 = new Dog();
        d1.setName("puppy");
        d1.setAge(6);
        d1.setBreed("bulldog");

        Dog d2 = new Dog();
        d1.setName("parker");
        d1.setAge(8);
        d1.setBreed("germenshephered");

        Dog[] dogs = {d1,d2};
        h.setDogs(dogs);
        System.out.println(h);
        
    }
    
}
class Human {
    private String name;
    private int age;
    Gender gender;

    Cars[] cars;

    Dog[] dogs;

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
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Cars[] getCars() {
        return cars;
    }
    public void setCars(Cars[] cars) {
        this.cars = cars;
    }
    public Dog[] getDogs() {
        return dogs;
    }
    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }
    @Override
    public String toString() {
        return "Human" +
                "name='" + name + '\'' +
                "' age=" + age +
                "'gender=" + gender +
                "'cars=" + Arrays.toString(cars)+
                "'Dogs=" + Arrays.toString(dogs) +
                '}';
    }


}
enum Gender {
    male,female;
}
