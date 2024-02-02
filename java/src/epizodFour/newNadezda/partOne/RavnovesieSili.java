package epizodFour.newNadezda.partOne;

public class RavnovesieSili {
    public static int theForce = 0;

    public void Force() {
        this.theForce++;
    }

    protected void finalize() throws Throwable {
        this.theForce--;
    }

    public static void main(String[] args) {

    }
}
