package epizodThree.mestSithov.partTwo;

public class NaPlaneteMustafar {
    static class Enemy {
        String name;
        int count;

        Enemy(String n, int j) {
            name = n;
            count = j;
        }

        Enemy(int i) {
            this("Anakin Skywoker", i);
        }

        Enemy() {
            this(20000);
        }

        public static void main(String[] args) {
            Enemy enemy = new Enemy();
            System.out.println("Enemy name: \"" + enemy.name + "\"\nCount of midichlorians: " + enemy.count);
        }
    }
}
