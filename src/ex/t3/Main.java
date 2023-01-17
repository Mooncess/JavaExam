package ex.t3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapIntToStr = new HashMap<>();
        mapIntToStr.put("2", "A");
        mapIntToStr.put("3", "B");
        mapIntToStr.put("4", "B");
        mapIntToStr.put("5", "D");
        System.out.println("Таблица 1");
        System.out.println(isUnique(mapIntToStr));
        printMap(mapIntToStr);
        System.out.println();
        mapIntToStr.put("6", "E");
        mapIntToStr.put("7", "E");
        System.out.println("Таблица 2");
        System.out.println(isUnique(mapIntToStr));
        printMap(mapIntToStr);
        System.out.println();
    }
    public static boolean isUnique (Map<String, String> currentMap) {
        Map<String, String> tempMap = new HashMap<>();
        for (var entry : currentMap.entrySet()) {
            for (var fleq : tempMap.entrySet()) {
                if (entry.getValue() == fleq.getValue()) {
                    return false;
                }
            }
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public static void printMap(Map<String, String> map) {
        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
