package ex.t2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapIntToStr = new HashMap<>();
        mapIntToStr.put(2, "A");
        mapIntToStr.put(3, "B");
        mapIntToStr.put(4, "C");
        mapIntToStr.put(5, "D");
        System.out.println("Таблица 1");
        Map<String,Integer> mapStrToInt = reverse(mapIntToStr);
        printMap(mapStrToInt);
        System.out.println();
        mapIntToStr.put(6, "E");
        mapIntToStr.put(7, "E");
        mapStrToInt = reverse(mapIntToStr);
        System.out.println("Таблица 2");
        printMap(mapStrToInt);
        System.out.println();
    }
    public static Map<String,Integer> reverse (Map<Integer, String> currentMap) {
        Map<String,Integer> reversedMap = new HashMap<>();
        for (var entry: currentMap.entrySet())  {
            if(reversedMap.get(entry.getValue()) == null) {
                reversedMap.put(entry.getValue(), entry.getKey());
            }
        }
        return reversedMap;
    }
    public static void printMap(Map<String, Integer> map) {
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
