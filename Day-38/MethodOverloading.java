public class MethodOverloading {
    public static void main(String[] args){
        Sample s = new Sample();
        s.sample();
        s.data(1);

    }
    
}
class Sample{
    void sample(){
        System.out.println("hello");
    }
    void data(int a){
        System.out.println("welcome");
    }
}
