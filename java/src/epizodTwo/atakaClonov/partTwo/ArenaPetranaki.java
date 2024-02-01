package epizodTwo.atakaClonov.partTwo;

import java.io.*;

public class ArenaPetranaki {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String count = bufferedReader.readLine();

        System.out.println("Master " + name + " is here " + count + " jedis");
    }
}
