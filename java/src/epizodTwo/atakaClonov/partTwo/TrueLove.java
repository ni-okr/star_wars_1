package epizodTwo.atakaClonov.partTwo;

import java.io.*;

public class TrueLove {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        System.out.println(name1 + " + " + name2 + " is a header of the Senate");
    }
}
