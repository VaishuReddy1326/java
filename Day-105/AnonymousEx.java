public class AnonymousEx {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("greetings");
                greetings("king");
            }
            public void greetings(String name) {
                System.out.println("hi"+name);
            }
        };
        greeting.greet();

    }
    
}
interface Greeting {
    void greet();
}
