package epizodTwo.atakaClonov.partTwo;

import java.io.*;

public class VPlenu {
    public static void main(String[] args) throws IOException {
//        ÷èòàåì ÷òî ïèøåì ñ êëàâû
//        òóò îáúÿâèì ïåðåìåííóþ â êîòîðóþ áóäåì çàíîñèòü âñå ÷òî ïèøåì
        InputStream inputStream = System.in;

//        êîíñòðóêòîð inputStreamReader() èç êëàññà Reader ÷òî áû ïåðåâåñòè èíôîðìàöèþ èç áàéòîâ â ñèìâîëû
        Reader inputStreamReader = new InputStreamReader(inputStream);
//        êîíñòðóêòîð bufferedReader() êëàññà BufferedReader äëÿ óâåëè÷åíèÿ ïðîèçâîäèòåëüíîñòè ÷òåíèÿ èç ïîòîêà
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//        ïðèñâàèâàåì íàïèñàííîå ñ êëàâû â ïåðåìåííóþ, ñ÷èòûâàÿ ñòðîêó ìåòîäîì readLine() êëàññà bufferedReader
        String name = bufferedReader.readLine();

        System.out.println(name + " is a header of the Senate");
    }
}
