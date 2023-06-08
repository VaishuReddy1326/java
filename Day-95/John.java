@Cock(rating = 34 , star = "scorpio")
@Cock(rating = 78, star = "cancer")

public class John {

    String name;
    John(String name) {
        this.name = name;
    }
    John(){

    }
    void print() {
        System.out.println(name.toLowerCase());
    }
    @Cock(star = "duck")
    @Cock(star = "rock")
    void helloPrint() {
        System.out.println("*");
    }
    
}
