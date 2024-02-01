package epizodThree.mestSithov.partTwo;

public class BoinyaVHrameJedaev {
    public class Jedi {
        String name;
        int count;
        String weapon;

        public void initialize (String name){
            this.name = name;
        }

        public void initialize (String name, int count) {
            this.name = name;
            this.count = count;
        }

        public void initialize (String name, int count, String weapon) {
            this.name = name;
            this.count = count;
            this.weapon = weapon;
        }
    }

    public static void main(String[] args) {

    }
}
