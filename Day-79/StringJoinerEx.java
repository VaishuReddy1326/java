import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-");

        sj.add("welcome");
        sj.add("to");
        sj.add("java");

        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner("&");

        sj1.add("never");
        sj1.add("stop");
        sj1.add("thinking");

        System.out.println(sj1);

        System.out.println(sj.length());

        System.out.println(sj.merge(sj1));

        System.out.println(sj.getClass());

        sj.setEmptyValue("it is empty");

    }
}
