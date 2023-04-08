public class ConstructorOverloading {
    public static void main(String[] args){
       Sample s = new Sample();
       Sample s1 = new Sample("hello",5);
       Sample s2 = new Sample(15);
       
    }
    
}
class Sample{
    Sample(){  //Default constructor

        System.out.println("no parameters");
    }
    Sample(int a){
        System.out.println("one parameter");
    }
    Sample(String str,int a){
        System.out.println("Two parameters");
    }
}
