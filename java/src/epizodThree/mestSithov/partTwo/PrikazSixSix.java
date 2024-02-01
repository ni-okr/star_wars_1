package epizodThree.mestSithov.partTwo;

public class PrikazSixSix {
    public static class Jedi {
        private String name;
        private int age;
        private int height;
        private String race;

        public Jedi(String name, int age, int height, String race) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.race = race;
        }
    }

    public static void main(String[] args) {
        Jedi yoda = new Jedi("Yoda", 900, 66, "unknown");
        Jedi jinn = new Jedi("Qui-Gon", 60, 193, "human");
        Jedi kenobi = new Jedi("Obi-Wan", 57, 182, "human");
    }
}
