import java.util.BitSet;
public class BitSetEx {

    public static void main(String[] args) {

    BitSet player1 = new BitSet();

    player1.set(1);
    player1.set(2);
    player1.set(3);
    player1.set(4);
    player1.clear(2);

    System.out.println(player1);

    BitSet player2 = new BitSet();

    player2.set(3);
    player2.set(4);
    player2.set(6);

    System.out.println(player2);

    player2.and(player1); // print the comman elements
    System.out.println(player2);

    player1.or(player2);
    System.out.println(player1);

    

    }
}
