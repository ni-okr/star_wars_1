package skritayaUgrozaPartTwo;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        читаем что пишем с клавы
//        тут объявим переменную в которую будем заносить все что пишем
        InputStream inputStream = System.in;

//        конструктор inputStreamReader() из класса Reader что бы перевести информацию из байтов в символы
        Reader inputStreamReader = new InputStreamReader(inputStream);
//        конструктор bufferedReader() класса BufferedReader для увеличения производительности чтения из потока
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        присваиваем написанное с клавы в переменную, считывая строку методом readLine() класса bufferedReader
        String name = bufferedReader.readLine();
        String count = bufferedReader.readLine();

        System.out.println("Master " + name + " is here " + count + " jedis");
    }
}
