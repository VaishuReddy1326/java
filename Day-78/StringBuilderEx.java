
public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        sb.append("world");
        System.out.println(sb);

        sb.insert(1,"rock ");
        System.out.println(sb);

        sb.replace(1,6,"the ");
        System.out.println(sb);

        sb.delete(10, 15);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.indexOf("o"));

        System.out.println(sb.lastIndexOf("l"));

        System.out.println(sb.length());

        System.out.println(sb.substring(4));



    }
    
}
