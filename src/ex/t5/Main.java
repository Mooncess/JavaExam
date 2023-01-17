package ex.t5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Throwable {
        Map<String, Integer> mapIntToStr = new HashMap<>();
        /*mapIntToStr.put("2", 22);
        mapIntToStr.put("3", 25);
        mapIntToStr.put("4", 25);
        mapIntToStr.put("5", 20);
        mapIntToStr.put("6", 20);
        mapIntToStr.put("7", 20);
        mapIntToStr.put("8", 25);
        mapIntToStr.put("9", 25);
        mapIntToStr.put("10", 22);*/
        System.out.println("Таблица 1");
        printMap(mapIntToStr);
        System.out.println();
        System.out.print("MIN = " + rarest(mapIntToStr));
    }
    public static Integer rarest (Map<String, Integer> currentMap) throws Throwable {
        int mu = Integer.MAX_VALUE;
        if (currentMap.isEmpty()) {
            throw new Exception("BRED!!!");
        }
        Map<Integer, Integer> tempMap = new HashMap<>();
        int minn = Integer.MAX_VALUE;
        for (var entry : currentMap.entrySet()) {
            if (!(tempMap.containsKey(entry.getValue()))){
                int n = 0;
                for (var fleq : currentMap.entrySet()) {
                    if (entry.getValue() == fleq.getValue()) {
                        n++;
                    }
                }
                tempMap.put(entry.getValue(), n);
                if (n < minn) {
                    minn = n;
                    mu = entry.getValue();
                }
            }
        }
        return mu;
    }

    public static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
