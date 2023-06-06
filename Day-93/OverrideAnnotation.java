// override annotation means overriding the subclass method to parent class mrthod,sometimes we do small mistakes so,it si better to mark @override annotation
public class OverrideAnnotation {

    public static void main(String[] args) {

        Rock r = new Rock();
        r.Rock();

    }
    
}
class Rock {
    
    void Rock(){
        System.out.println("rock");
    }
}
class Mock extends Rock {
    @Override
    void Rock(){
        System.out.println("rock");
    }
}
