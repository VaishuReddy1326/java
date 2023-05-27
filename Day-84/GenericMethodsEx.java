

public class GenericMethodsEx {

    public static void main(String[] args) {
         details("king" , 20000);
         details("queen" , 15000);
         details("moon" , 54000);

    }
    public static<T , X> void details(T name,X salary) {
        System.out.println("name: " + name +"salary: " +salary);
    }
    
}
