package epizodThree.mestSithov.partTwo;

public class DartWeider {
    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        String sideForce;
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
        public Jedi(String name, int age, int midichlorians, String homeworld, String species, String sideForce){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
            this.sideForce = sideForce;
        }
    }

    public static void main(String[] args) {
        TiBilMneKakBrat.Jedi yoda = new TiBilMneKakBrat.Jedi("Yoda", 251, 298263875);
        System.out.println("Light side force:\n" + yoda.name);
        TiBilMneKakBrat.Jedi maceWindu = new TiBilMneKakBrat.Jedi("Mace Windu", 29231);
        System.out.println(maceWindu.name);
        TiBilMneKakBrat.Jedi obiWanKenobi = new TiBilMneKakBrat.Jedi("Obi-Wan Kenobi", 45, 86653, "Stewjon", "Human");
        System.out.println(obiWanKenobi.name);
        TiBilMneKakBrat.Jedi ploKoon = new TiBilMneKakBrat.Jedi("Plo Koon", 76, 525468);
        System.out.println(ploKoon.name);
        TiBilMneKakBrat.Jedi kiAdMundi = new TiBilMneKakBrat.Jedi("Ki-Adi-Mundi", 81276);
        System.out.println(kiAdMundi.name);
        TiBilMneKakBrat.Jedi kitFisto = new TiBilMneKakBrat.Jedi("Kit Fisto", 913276);
        System.out.println(kiAdMundi.name);
        TiBilMneKakBrat.Jedi saseeTiin = new TiBilMneKakBrat.Jedi("Shaak Ti", 581732, "Shili");
        System.out.println(saseeTiin.name);
        TiBilMneKakBrat.Jedi stassAllie = new TiBilMneKakBrat.Jedi("Stass Allie", 92, 687039);
        System.out.println(stassAllie.name);
        TiBilMneKakBrat.Jedi agenKolar = new TiBilMneKakBrat.Jedi("Agen Kolar", 873986);
        System.out.println(agenKolar.name);
        TiBilMneKakBrat.Jedi colemanKcaj = new TiBilMneKakBrat.Jedi("Coleman Kcaj", 54, 647894567);
        System.out.println(colemanKcaj.name);
        TiBilMneKakBrat.Jedi anakinSkywalker = new TiBilMneKakBrat.Jedi("Anakin Skywalker", 18, 869318694, "Tatooine", "Human");
        System.out.println("\ndark side force:\n" + anakinSkywalker.name);
    }
}
