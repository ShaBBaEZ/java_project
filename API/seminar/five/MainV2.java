package Java_project.seminar.five;

import java.util.HashMap;
import java.util.Map;

/*
 * создать структуру для хранения номеров паспортов и фамилий сотруднкиов
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов
 */

public class MainV2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addNote(map, "123456", "Иванов");
        addNote(map, "321456", "Васильев");
        addNote(map, "234561", "Петрова");
        addNote(map, "234432", "Иванов");
        addNote(map, "654321", "Петрова");
        addNote(map, "345678", "Иванов");

        System.out.println(findByName(map,"Иванов"));
    }
    
    static void addNote(Map<String,String> map, String num, String name){//метод для добавления ключа и значения выше использование
        map.put(num,name);
    }

    static String findByName(Map<String, String> map, String lastName){// метод для вывода записи по имени
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){//Map.Entry - объект который содержит две переменные ключ и значение
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
