public class EnumString {
    public static void main(String[] args) {

        System.out.println(Season.SUMMER.toString());

    }
    
}
enum Season {

    WINTER {

        // overriding toString() for winter
        public String toString() {
            return "This is winter season";
        }
    },
    SUMMER {

        //overriding toString() for summer
        public String toString() {
            return "This is summer season";
        }
    };
    
}
