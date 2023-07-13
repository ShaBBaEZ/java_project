package Java_project.Home_work.five;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
/*
 * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, 
 *                               Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова,
 *                               Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */
import java.util.Map;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        String string = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков," +
                        " Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова," + 
                        " Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов."; 
        string = string.replace(".", " ");
        string = string.replace(",", "");
        String[] word = string.split(" ");
        result(word);
    }
    static void result(String [] word){
        Map<String,Integer> map = new TreeMap<String, Integer>();// если вместо TreeMap поставить HashMap то они выведутся в правильном порядке
        for (int i = 0; i < word.length; i++) {
            Integer len = 1;
            if(map.containsKey(word[i])){
                Integer value = map.get(word[i]);
                value+=len;
                map.put(word[i],value);
            } else {
            map.put(word[i], len);
            }
        }
        for(Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext(); ) {// удаляет то где значение не повторялось.
            String key = iterator.next();
            if(map.get(key) == 1) {
              iterator.remove();
            }
        }
        // Map<String, Integer> sortedMap2 = new TreeMap<String, Integer>(Comparator.comparing(map::get)); гугл выдавал такое, но выводит пустое значение
        // System.out.println(sortedMap2); 
        System.out.println(map);
    }
}
