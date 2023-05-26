

public class GenericEx {
    public static void main(String[] args) {

        Weight<Integer> dog = new Weight<>(55);

        Weight<Float> cat = new Weight<>(5.5f);

        Weight<Double> buffaloo = new Weight<>(156.45677);

        System.out.println(cat.getWeight());

        System.out.println(buffaloo.getWeight());
    }
    
}
class Weight<E> {

    E marks;

    Weight(E e) {
        marks = e;
    }
    E getWeight() {
        return this.marks;

    }
}
