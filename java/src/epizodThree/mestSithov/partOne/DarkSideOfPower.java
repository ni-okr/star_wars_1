package epizodThree.mestSithov.partOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DarkSideOfPower {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        if (numb < 0)
            System.out.println("it's Dark side");
        else if (numb == 0)
            System.out.println("it's balance");
        else
            System.out.println("it's Light side");
    }
}
