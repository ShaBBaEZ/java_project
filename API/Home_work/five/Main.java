package Java_project.Home_work.five;
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        addNote(map, "Иванов","9999 123 19");
        addNote(map, "Петров","8888 321 18");
        addNote(map, "Сидоров","7777 213 17");

        System.out.println(map);
    }


    static void addNote (Map<String, List<String>> map, String key, String phone){
        List<String> values = new ArrayList<String>();
        String[] phones = phone.split(" ");
        for (int i = 0; i < phones.length; i++) {
            values.add(phones[i]);
        }
        map.put(key, values);
    }
}



