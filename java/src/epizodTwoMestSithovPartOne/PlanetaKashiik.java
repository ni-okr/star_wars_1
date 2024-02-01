package epizodTwoMestSithovPartOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetaKashiik {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int a = m; a != 0; a--) {
            for (int b = n; b != 0; b--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
