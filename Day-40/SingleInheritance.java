//SingleInheritance means supercalss inherits the features of subclass.
public class SingleInheritance {
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        v.sound();
        v.model();

    }
    
}
class Honda{
  
    public void sound(){
        System.out.println("peep peep");
    }
}
class Vehicle extends Honda{
    protected void model(){
        System.out.println("sedan honda");
    }

}
