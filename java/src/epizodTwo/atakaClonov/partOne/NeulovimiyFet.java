package epizodTwo.atakaClonov.partOne;

public class NeulovimiyFet {
    public static double getWeight(int weight) {
        return (weight * 0.17);
    }

    public static void main(String[] args) {
        System.out.println(getWeight(800));
    }
}
