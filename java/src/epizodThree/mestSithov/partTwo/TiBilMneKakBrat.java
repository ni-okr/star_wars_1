package epizodThree.mestSithov.partTwo;

public class TiBilMneKakBrat {
    static class Jedi{
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        public Jedi(String name, int midichlorians){
            this.name = name;
            this.midichlorians = midichlorians;
        }
        public Jedi(String name, int age, int midichlorians){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }
        public Jedi(String name, int midichlorians, String homeworld){
            this.name = name;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
        }
        public Jedi(String name, int age, int midichlorians, String homeworld, String species){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
        }

    }

    public static void main(String[] args) {
        Jedi yoda = new Jedi("Yoda", 251, 298263875);
        Jedi maceWindu = new Jedi("Mace Windu", 29231);
        Jedi obiWanKenobi = new Jedi("Obi-Wan Kenobi", 45, 86653, "Stewjon", "Human");
        Jedi ploKoon = new Jedi("Plo Koon", 76, 525468);
        Jedi kiAdMundi = new Jedi("Ki-Adi-Mundi", 81276);
        Jedi kitFisto = new Jedi("Kit Fisto", 913276);
        Jedi saseeTiin = new Jedi("Shaak Ti", 581732, "Shili");
        Jedi stassAllie = new Jedi("Stass Allie", 92, 687039);
        Jedi agenKolar = new Jedi("Agen Kolar", 873986);
        Jedi colemanKcaj = new Jedi("Coleman Kcaj", 54, 647894567);
        Jedi anakinSkywalker = new Jedi("Anakin Skywalker", 18, 869318694, "Tatooine", "Human");
    }
}
