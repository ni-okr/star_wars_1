package epizodTwo.atakaClonov.partOne;

public class TenYearsLater {
    static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    static void say(String name, String color) {
        System.out.println("Hello, my name is " + name + " and my cat is " + color);
    }

    static void count(int n) {
        System.out.println("Ïåðâàÿ ñòåïåíü ÷èñëà " + n + " = " + n);
        System.out.println("Êâàäðàò ÷èñëà " + n + " = " + n * n);
        System.out.println("Êóá ÷èñëà " + n + " = " + n * n * n);
        System.out.println("×åòâåðòàÿ ñòåïåíü ÷èñëà " + n + " = " + n * n * n * n);
    }

    public static void main(String[] args) {
        print("The power is easy to use!");
        print("The power opens many opportunites!");
        System.out.println();
        System.out.println();

        say("Mike", "black");
        System.out.println();
        System.out.println();

        count(5);

        System.out.println();
        System.out.println();

        Owner owner_1 = new Owner();
        Pet pet_1 = new Pet();

        owner_1.name = "Mike";
        pet_1.kind = "cat";
        pet_1.color = "black";
        owner_1.pet = pet_1;
        owner_1.say();
    }

    static class Owner {
        String name;
        Pet pet;

        void say() {
            System.out.println("Hello, my name is " + name + " and my " + pet.kind + " is " + pet.color);
        }
    }

    static class Pet {
        String kind;
        String color;
    }
}
