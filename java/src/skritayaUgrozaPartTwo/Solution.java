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
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        System.out.println(name1 + " + " + name2 + " is a header of the Senate");
    }
}
