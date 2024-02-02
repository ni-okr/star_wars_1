package epizodFour.newNadezda.partOne;

public class ArestLei {
    class Jedi {
        public static void main(String[] args) {

        }
        protected void finalize() throws Throwable {
            System.out.println("A Jedi was destroyed");
        }
    }

    class Sith {
        protected void finalize() throws Throwable {
            System.out.println("A Sith was destroyed");
        }
    }
}
