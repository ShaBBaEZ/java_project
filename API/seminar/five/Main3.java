package Java_project.seminar.five;
/*
 * Взят набор строк например
 * Мороз и солнце день чудесный
 * Еще ты дремлешь друг прелестный
 * Пора красавица проснись.
 * 
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap
 * Строки с одинаковой длиной не должны потеряться
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main3 {
    public static void main(String[] args) {
        String s =  "Мороз и солнце день чудесный\n" +
                    "Еще ты дремлешь друг прелестный\n" +
                    "Пора красавица проснись.";
        s = s.replace(".", "");// меняем точку на пустое значение
        s = s.replace("\n", " ");// меняем перенос строки на пробел
        String[] words = s.split(" ");// сплитим слова по пробелу и записываем в массив каждое слово

        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word : words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
