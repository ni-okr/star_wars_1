package epizodTwoMestSithovPartOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RokovoeReshenie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int numb = Integer.parseInt(reader.readLine());
        while (numb != 0){
            System.out.println(str);
            numb--;
        }
    }
}
