
public class Car {
    private String color;
    public double maxSpeed;

    public static void main(String[] args) {
      Car1 c = new Car1();
      c.setColor();
        
    }

}
class Car1 {
    private String color;
    public double maxSpeed;

    public void setColor() {
        System.out.println("car contains red color");
    }
    public void carInfo() {
        System.out.println("car color= " + color);
    }
}
    

       
