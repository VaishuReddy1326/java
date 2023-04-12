class WildAnimal{
     static String name="Tiger";
    public static void lion(){
        System.out.println("roar.");
    }
    static class Animal{
        public static void dog(){
            System.out.println("bow bow..");
        } 

    }
}

public class InnerClass1 {
    public static void main(String[] args){
        WildAnimal w=new WildAnimal();
        w.lion();
        System.out.println(w.name);
        WildAnimal.Animal WA=new WildAnimal.Animal();
        WA.dog();

    }
    
}
