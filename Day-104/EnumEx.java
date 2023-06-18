//enum can implement many interfaces but cannot extend class because it internally extends enum class
public class EnumEx {
    public static void main(String[] args) {

        System.out.println(Size.MEDIUM.getSize());

        System.out.println(Size.valueOf("LARGE"));// value method return the value of given constant

        System.out.println(Size.values());

    }

    
}

enum Size {
    SMALL,MEDIUM,LARGE,EXTRALARGE;
    public String getSize() {

        switch(this){
            case SMALL:            
                return "small";

            case MEDIUM :
                return "medium";

            case LARGE :
                return "large";

            case EXTRALARGE :
                return "extralarge";

            default :
                return "null";
        }
    }
}
