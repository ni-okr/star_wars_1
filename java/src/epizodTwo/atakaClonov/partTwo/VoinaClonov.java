package epizodTwo.atakaClonov.partTwo;

import java.util.Scanner;

public class VoinaClonov {
    public static int getYear (int number){
        return number - 35;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (getYear(number) < 0){
            System.out.println(Math.abs(getYear(number)) + " year before Yawin");
        }
        else {
            System.out.println(getYear(number) + " year after Yawin");
        }
    }
}
