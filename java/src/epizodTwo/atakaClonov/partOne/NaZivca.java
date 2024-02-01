package epizodTwo.atakaClonov.partOne;

public class NaZivca {
    static void increaseSpeed(int speed) {
        System.out.println("Your speed is: " + (speed + 100) + " km/h.");
    }

    public static void main(String[] args) {
        increaseSpeed(700);
    }
}
