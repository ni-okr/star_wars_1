package epizodThree.mestSithov.partTwo;

public class Predatelstvo {
    static class Jedi{
        public String name;
        public int age;
        public int midichlorians;

        public void initialize (String name, int age, int midichlorians){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }
    }

    public static void main(String[] args) {
        Jedi jedi = new Jedi();
        jedi.initialize("Anaken", 40, 9000);
    }
}
