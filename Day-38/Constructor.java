

public class Constructor {
    public static void main(String[] args){
      Constructor obj = new Constructor();
      Constructor obj1 = new Constructor(10,20);
    }

    Constructor(){
        System.out.println("no parameters");
    }
    Constructor(int a,int b){
        System.out.println("two parameters");

    }
   
}

