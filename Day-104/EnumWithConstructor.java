public class EnumWithConstructor {
    public static void main(String[] args) {

        Color color = Color.PINK;

        System.out.println(color.getColor());

    }
}
enum Color {
    PINK("this is pink color"),
    GREEN("this is green color"),
    YELLOW("this is yellow color"),
    RED("this is red color");

    private final String dressColor;

    //private enum constructor
    private Color(String dressColor) {
        this.dressColor = dressColor;
    }
    public String getColor() {
        return dressColor;
    }

}