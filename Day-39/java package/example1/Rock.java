package example1;

public class Rock {
   public int a;  // public modifier
   int age;       //Default modifier


    public static void main(String[] args) {
        Rock r=new Rock();
        Hi h=new Hi();
        System.out.println(r.age);
        System.out.println(h.name);
    }
}
