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

        System.out.println(name + " is a header of the Senate");
    }
}
