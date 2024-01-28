package skritayaUgrozaPartTwo;

public class Solution {
    public static class Zam {
        public int age;
        public int height;
        public Dron spy;
    }

    public static class Dron {
        public int version;
        public int weight;
        public Zam hunter;

    }

    public static void main(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();

        dron.hunter = zam;
        zam.spy = dron;
    }
}
