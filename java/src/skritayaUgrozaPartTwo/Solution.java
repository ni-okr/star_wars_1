package skritayaUgrozaPartTwo;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        ������ ��� ����� � �����
//        ��� ������� ���������� � ������� ����� �������� ��� ��� �����
        InputStream inputStream = System.in;

//        ����������� inputStreamReader() �� ������ Reader ��� �� ��������� ���������� �� ������ � �������
        Reader inputStreamReader = new InputStreamReader(inputStream);
//        ����������� bufferedReader() ������ BufferedReader ��� ���������� ������������������ ������ �� ������
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        ����������� ���������� � ����� � ����������, �������� ������ ������� readLine() ������ bufferedReader
        String name = bufferedReader.readLine();
        String count = bufferedReader.readLine();

        System.out.println("Master " + name + " is here " + count + " jedis");
    }
}
