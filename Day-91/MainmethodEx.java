
// static public void main(String[] args) // we can declare the main method as public static
// static void public main(String[] args) // we can't declare like this because before main type we must declare the return type
// static public void main(String[] a) // instead of args we can declare any name
// static public void main(int[] x) // we can declare any array type like int,float,double but it is not consider as starting point execution 
public class MainmethodEx {

    public static void main(int[] a){

        System.out.println("hello"); //to execute this method we have to explicitly call this method

    }
    public static void main(String[] args) { //this method executed implicitly by jvm

        System.out.println("hi");

        int[] x = {4 , 5};

        main(x); // calling main method

    }
    
}

