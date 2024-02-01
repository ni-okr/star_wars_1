package epizodThree.mestSithov.partTwo;

public class FirstGalacticImperia {
    class Tunnel {
        private int centerX, centerY, radius,  width;

        public void initialize (int centerX, int centerY){
            this.centerX = centerX;
            this.centerY = centerY;
        }

        public void initialize (int centerX, int centerY, int radius){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void initialize (int centerX, int centerY, int radius, int width){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
    }

    public static void main(String[] args) {

    }
}
