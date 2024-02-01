package epizodTwoMestSithovPartOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VolyaKanclera {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());
        boolean positive = false;
        boolean even = false;
        if (numb > 0)
            positive = true;
        if (numb % 2 == 0)
            even = true;
        if (numb == 0)
            System.out.println("balance");
        else if (positive && even)
            System.out.println("compassion");
        else if (positive && !even)
            System.out.println("mercy");
        else if (!positive && even)
            System.out.println("pain");
        else if (!positive && !even)
            System.out.println("anger");
    }
}
