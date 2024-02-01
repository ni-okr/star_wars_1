package epizodTwo.atakaClonov.partTwo;

import java.io.IOException;
import java.util.Scanner;

public class BitvaSGrafomDuku {
    public static int sumDigitsInNumber(int number){
        return (number / 100 + number / 10 % 10 + number % 10);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(sumDigitsInNumber(322));
    }
}
