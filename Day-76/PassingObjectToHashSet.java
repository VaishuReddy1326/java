import java.util.*;
public class PassingObjectToHashSet {

    public static void main(String[] args) {

        HashSet<Car> set = new HashSet<>();
        Car c = new Car();
        c.setName("suzuki");
        c.setMillage(126);

        Car c1 = new Car();
        c1.setName("honda");
        c1.setMillage(124);

        set.add(c);
        set.add(c1);

        Iterator<Car> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}

 class Car {
    private String name;
    private int millage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    @Override


    public String toString() {
        return "car{" + 
                "name=" + name +
                " ,millage='" + millage+ '\''+
                '}';
    }
}









    




    
    
    
    
