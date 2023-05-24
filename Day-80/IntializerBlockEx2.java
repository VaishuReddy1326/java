public class IntializerBlockEx2 {
    public static void main(String[] args) {
        cat c1 = new cat();

        cat c2 = new cat("pinky");

        cat c3 = new cat("min" , 1);
    }
    
}
class cat {
    
    private static int count;

    private String name;
    
    private int age;
    {
        count++;
    }
    public cat() {
        System.out.println("empty constructor");
    }
    public cat(String name) {
        this.name = name;

    }
    public cat(String name , int age) {
        this.age = age;
    }
    public static int getCount() {
        return count;
    }

}