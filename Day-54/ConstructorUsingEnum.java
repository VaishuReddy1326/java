
enum Colors {
    RED,
    SKYBLUE("SKYBLUE"),
    PINK("PINK " ,"BABYPINK ");

    Colors() {
        System.out.println("choose red");
    }
    Colors(String str) {
        System.out.println("choose " + str);
    }
    Colors(String str1 , String str2) {
        System.out.println("choose" + str1 +" " + str2);
    }

}

public class ConstructorUsingEnum {
    public static void main(String[] args) {

        var color = Colors.PINK;

        System.out.println(color);
    }

    
}
