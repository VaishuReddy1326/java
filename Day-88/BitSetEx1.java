import java.util.BitSet;

public class BitSetEx1 {

    public static void main(String[] args) {

        BitSet data1 = new BitSet(10);

        BitSet data2 = new BitSet(10);

        data1.set(3);
        data1.set(6);
        data1.set(9);
        data1.clear(3,6);

        data2.set(6);
        data2.set(8);
        

        System.out.println(data1.cardinality()); // returns the no.of bits set to true

        System.out.println(data1.size());  //return the size of the bitset

        System.out.println(data2.length()); // returns the length of the bitset

        System.out.println(data2.clone()); // convert the bitset to new bitset which is equal to it

        System.out.println(data2.equals(data1)); //compare the current object with the specified object

        data1.flip(2,48);
        System.out.println(data1); // return complement of each bit from 2 to 48

        System.out.println(data2.isEmpty()); // checks it is empty or not 

        System.out.println(data1.intersects(data2)); // checks any set value contains at same indices in both bitsets

        System.out.println(data2.previousClearBit(6)); // returns the before  index which is set to false

        System.out.println(data2.previousSetBit(6)); // return the before index which is set to true

        System.out.println(data2.toString()); // returns the representation of string

    

    }
    
}
