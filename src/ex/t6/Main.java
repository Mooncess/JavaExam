package ex.t6;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        var testArray = new String[] {"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        System.out.println(Arrays.toString(testArray));
        guavaSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void guavaSort(String[] array) {
        var stringCountMap = new TreeMap<String, Integer>();
        for (var s : array) {
            if (stringCountMap.containsKey(s)){
                stringCountMap.put(s, stringCountMap.get(s)+1);
            }else{
                stringCountMap.put(s, 1);
            }
        }
        var index = 0;
        for (var entry : stringCountMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                array[index] = entry.getKey();
                index++;
            }
        }
    }
}
