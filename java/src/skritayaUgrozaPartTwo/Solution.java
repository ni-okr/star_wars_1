package skritayaUgrozaPartTwo;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String phrase = bufferedReader.readLine();

        System.out.println(phrase);
    }
}
