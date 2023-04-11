public class FinalKeyword {
    public static void main(String[] args){
        A obj=new A();
        obj.car(); 

    } 
    
}
class A{
    final String vehicle="Honda";
    public void car(){
        vehicle="suzuki"; //cannot change the value of the final variable
    }
}
