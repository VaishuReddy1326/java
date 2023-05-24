public class IntializerBlockEx3 {

    public static void main(String[] args) {

        int x = 10;
        {
            // x = 10  duplicate variable
            System.out.println(x);

            int  y = 20;

            System.out.println(y);
        }

        int  z = 30;

        System.out.println(z);
    }
    
}
