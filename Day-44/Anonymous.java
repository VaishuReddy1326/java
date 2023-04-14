class polygon{
    void display(){
        System.out.println("polygon class");
    }
}

public class Anonymous {
    public static void main(String[] args){
        polygon p=new polygon(){
            void display(){
                System.out.println("polygon class");
            }
        };
        p.display();


    }
    
}
