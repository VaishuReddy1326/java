import java.util.HashMap;

public class PlayersReady {

    static HashMap<Integer,Boolean> hashmap = new HashMap<>();
    public static void main(String[] args) {
    
        for(int i = 0; i < 100; i++){

            hashmap.put(i, true);
        }

        hashmap.put(5, false);

        hashmap.put(15, false);


        hashmap.put(25, negation(hashmap.get(25)));

        hashmap.put(57, negation(hashmap.get(57)));

        hashmap.put(5, negation(hashmap.get(5)));

        System.out.println("players ready:"+getPlayersReady());


    }
    static boolean negation(boolean prevState) {

        return !prevState;
    }
    static int getPlayersReady() {

        int count = 0;

        for(var x : hashmap.values()){

            if(x)

                count++;
        }
        return count;

    }
    
}
